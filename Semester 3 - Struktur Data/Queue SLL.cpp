#include <iostream> 
#include <string.h> //strcmp() ; strcpy()
using namespace std;

//Mendefinisikan Node dnegan struct
struct Node{
	int umur;
	char nama[30];
	Node *next;
};

//Membuat Node baru dengan nama head dan tail
Node *head= NULL;
Node *tail=NULL;

//Mendefinisikan prosedur hitung
int hitung(Node *head){ 
    int count=0;
    Node *curr=head;
    while (curr!=NULL) { 
        count++; 
        curr=curr->next; 
    } 
    return count; 
} 

//Mendefinisikan prosedur enqueue untuk menambah data
void enqueue()
{

	char a[30];
	int b;
	int maks=5;
	
	if(hitung(head)<maks){
	
		//Masukan data-datanya
		cout<<"Masukkan Nama : "; cin>>a;
		cout<<"Masukkan Umur : "; cin>>b;
		//Buat Node baru :: Memesan Tempat di memory
		Node *baru;
		baru= new Node;
		//Masukan Datanya ke Node Baru
		strcpy(baru->nama,a);
		baru->umur=b;
		
		if(head==NULL)
		{
			head=baru;	
			head->next=NULL;
			tail=head;
		}
		else
		{
			tail->next=baru;
			tail=baru;
			tail->next=NULL;
		}
	}
	else {
		cout << "FULL... \nMaaf, Queue penuh" << endl;
	}
}

//Mendefinisikan prosedur dequeue untuk menghapus data
void dequeue()
{
	if(head==NULL)
		cout<<"Empty... \nMaaf, tidak ada data yang bisa dihapus" << endl;
	else {
		//Jika hanya terdapat 1 data 
		if(head==tail)
			{
				delete head;
				head=NULL;
				tail=NULL;
			}	
		else
			{
				Node *bantu;
				bantu = head->next;
				delete head;
				head = bantu;
			}
	}
}

//prosedur display untuk menampilkan data
void display(){
	//jika list kosong
	if(head==NULL){
		cout << "Empty... \nMaaf, tidak ada data yang ditampilkan" << endl;
	}
	else {
		Node *bantu;
		bantu = head;
		while(bantu!=NULL){
			cout << bantu->nama << "\t"<< bantu->umur << endl;
			bantu = bantu->next;
		}
	}
}

int main(){
	int pilihan;
	
	do{
		cout << "=================================================" << endl;
		cout << "------------QUEUE LINKED LIST PROGRAM------------" << endl;
		cout << "=================================================" << endl;
		cout << "Menu : \n";
		cout << " 1. ENQUEUE (Tambahkan Data) \n 2. DEQUEUE (Hapus Data) \n 3. Tampilkan Data \n 4. Keluar" << endl;
		cout << "-------------------------------------------" << endl;	
		cout << "Masukkan Pilihan : "; cin >> pilihan;
		switch (pilihan){
			case 1 :
				enqueue();
				break;
			case 2 :
				dequeue();
				break;
			case 3 :
				display();
				break;	
			case 4 :
				break;
			default :
				cout << "Tidak ada pilihan \nMohon masukkan pilihan dengan benar" << endl;
		}
	}
	while (pilihan != 4);
	
	cout<< "Terima kasih telah menggunakan program!";
	
	return 0;
}
