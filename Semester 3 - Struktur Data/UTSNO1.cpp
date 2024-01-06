#include <iostream>
#define MAX 20 //maksimum data queue
using namespace std;

//Deklarasi struct antrian
struct Queue {
	int front, rear, data[MAX];
}Q;

//Pengecekan apakah antrian penuh
bool isFull() {
	return Q.rear == MAX;
}

//Pengecekan apakah antrian kosong
bool isEmpty() {
	return Q.rear == 0;
}

//Menampilkan Queue
void printQueue() {
	if (isEmpty()) {
    cout << "Antrian kosong"<<endl;
	}
	else {
		cout << "Silahkan Menuju Teller untuk Nomor Antrian: ";
		for (int i = Q.front; i < Q.rear; i++)
		//Menambahkan koma jika data tidak terdapat di antrian pertama
			cout << Q.data[i] << ((Q.rear-1 == i) ? "" : ",");
		cout << endl;
  }
}

//Menambahkan data ke antrian
void enqueue() {
	if (isFull())
	{
		cout << "Antrian penuh!"<<endl;
	}
	else {
		int data;
		//menambahkan data ke antrian
		cout << "Masukkan Nomor Antrian : ";cin >> data;
		Q.data[Q.rear] = data;
		//menempatkan tail pada elemen data terakhir yang ditambahkan
		Q.rear++;
		cout << "Nomor Antrian Ditambahkan\n";
		printQueue();
	}
}

//Mengambil data dari antrian
void dequeue() {
	if (isEmpty())
	{
		cout << "Antrian masih kosong"<<endl;
	}
	else{
		cout << "Mengambil data \"" << Q.data[Q.front] << "\"..." << endl;
		//Menggeser antrian data ke head
		for (int i = Q.front; i < Q.rear; i++)
			Q.data[i] = Q.data[i + 1];
		//Menempatkan tail pada data terakhir yang digeser
		Q.rear--;
		printQueue();
	}
}

int main() {
	int choose;
	do
	{
		//Tampilan menu
		cout << "-------------------\n"
			<< "    ANTRIAN BANK    \n"
			<< "-------------------\n"
			<< " [1] Ambil dan Masukkan Nomor Antrian Anda \n"
			<< " [2] Hapus Semua Antrian\n"
			<< " [3] Keluar \n\n"
			<< "-------------------\n"
			<< "Masukkan pilihan : "; cin >> choose;
		switch (choose)
		{
		case 1:
			enqueue();
			break;
		case 2:
			dequeue();
			break;
		default:
			cout << "Pilihan tidak tersedia";
			break;
		}
	} while (choose !=3);
	return 0;
}

