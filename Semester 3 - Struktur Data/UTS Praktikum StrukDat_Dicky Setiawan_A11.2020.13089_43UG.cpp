#include <iostream>
#include <conio.h>
#include <windows.h>

using namespace std;

// Definisi struktur untuk menyimpan data antrian
struct queue
{
    char nama[30];
    int umur;
};

// Variabel global queue
struct queue user[10];
int maks = 10;
int tail = -1;
int head = -1;

void gotoxy(int x, int y)
{
	COORD coord = {x,y};
	
	SetConsoleCursorPosition(GetStdHandle(STD_OUTPUT_HANDLE), coord);
}

kotak(int klm1, int brs1, int klm2, int brs2)
{
	int x;
	for(x = klm1 ; x < klm2 ; x++)
	{
		gotoxy(x,brs1);printf("%c",196); //garis horizontal (kotak atas)
		
		gotoxy(x,brs2);printf("%c",196); //garis horizontal (kotak bawah)
	}
	for(x = brs1 ; x < brs2 ; x++)
	{
		gotoxy(klm1,x);printf("%c",179); //garis vertikal (kotak kiri)
		
		gotoxy(klm2,x);printf("%c",179); //garis vertikal (kotak kanan)
	}
	// Sudut kotak
	gotoxy(klm1,brs1);printf("%c",218);
	
	gotoxy(klm2,brs2);printf("%c",217);
	
	gotoxy(klm1,brs2);printf("%c",192);
	
	gotoxy(klm2,brs1);printf("%c",191);
}
// Mendefinisikan fungsi untuk mengecek apakah antrian penuh atau kosong
bool isFull()
{
    if ((head == 0 && tail == maks-1) || (head == tail+1))
    {
        return true;
    }
    else
    {
        return false;
    }
}

bool isEmpty()
{
    if (tail == -1 && head == -1)
    {
        return true;
    }
    else
    {
        return false;
    }
}

// Mendefinisikan prosedur untuk menambahkan elemen ke dalam antrian
void enqueue()
{
    if(isFull())
    {
        gotoxy(5,30); cout << "Maaf antrian sedang penuh, mohon tunggu sesaat lagi!" << endl;
    }
    else
    {
    kotak(54,8,85,10);
    kotak(54,10,85,13);
        // Pengecekan elemen baru yang masuk 
        if (head == -1)
        {
            head = 0;
            tail = 0;
        }
        else
        {
            if(tail == maks -1)
            {
                tail = 0;
            }
            else
            {
                tail = tail + 1;
            }
        }
        gotoxy(63,9); cout << "Menu Enqueue" << endl << endl;
        gotoxy(55,11); cout << "  Nama\t: "; cin >> user[tail].nama;
        gotoxy(55,12); cout << "  Umur\t: "; cin >> user[tail].umur;
    }
}

// Mendefinisikan prosedur untuk menghapus elemen dari antrian
void dequeue()
{
	int i;
    if(isEmpty())
    {
        cout << "Antrian sedang kosong, silahkan ambil tiket untuk mengantri!" << endl;
    }
    else
    {
        if(head == tail)
        {
            head = -1;
            tail = -1;
        }
        else
        {
            if (head == maks +1)
            {
                head = 1;
            }
            else
            {
                head = head + 1;
            }
        }
        {
        	cout << "     Nomor Antrian\t: " << i+1 << endl;
        	cout << "     Nama\t	: " << user[i].nama << endl;
        	cout << "     Umur\t	: " << user[i].umur << endl << endl;
        	cout << "     Telah Dikeluarkan" << endl;
		}
    }
}

//  Mendefinisikan prosedur untuk menampilkan semua data antrian
void showData()
{
}
tampil()
{
	int a,z;
	system("cls");
	kotak(1,1,50,3); //Judul
	kotak(1,3,50,6); //Nama dan NIM
	kotak(1,8,50,10); //Menu Antrian
	kotak(1,10,50,15); //Menu 1,2,3,4
	kotak(1,15,50,17); //Masukkan pilihan
	
    if(isEmpty())
    {
        gotoxy(5,18); cout << "Antrian sedang kosong, silahkan ambil tiket untuk mengantri!" << endl;
    }
    else
    {
    gotoxy(5,20); cout << "" << endl;
        int i;
        if (tail >= head)
        {
            for(i = head ; i <= tail ; i++)
            {
            	cout << "     Nomor Antrian\t: " << i+1 << endl;
        		cout << "     Nama\t 	: " << user[i].nama << endl;
        		cout << "     Umur\t 	: " << user[i].umur << endl << endl;
            }
        }
        else
        {
            for(i = head ; i < maks ; i++)
            {
            	cout << "     Nomor Antrian\t: " << i+1 << endl;
        		cout << "     Nama\t 	: " << user[i].nama << endl;
        		cout << "     Umur\t 	: " << user[i].umur << endl << endl;
            }
            for(i = 0 ; i <= tail ; i++)
            {
            	cout << "     Nomor Antrian\t: " << i+1 << endl;
        		cout << "     Nama\t 	: " << user[i].nama << endl;
        		cout << "     Umur\t 	: " << user[i].umur << endl << endl;
            }
        }
    }
}

int main()
{
    int pilih;
    do
    {
    	tampil();
    	gotoxy(12,2); cout << "UTS Praktikum Struktur Data" << endl;
    	gotoxy(5,4); cout << "Dicky Setiawan" << endl;
    	gotoxy(5,5); cout << "A11.2020.13089" << endl;
    	gotoxy(18,9); cout << "Menu Antrian" << endl;
    	gotoxy(5,11); cout << " 1. Enqueue (Ambil Tiket Antrian) " << endl;
    	gotoxy(5,12); cout << " 2. Dequeue " << endl;
    	gotoxy(5,13); cout << " 3. Tampilkan Data Antrian " << endl;
    	gotoxy(5,14); cout << " 4. Keluar " << endl;
    	gotoxy(5,16); cout << "Masukkan Pilihan Anda : ";cin>>pilih;
    		if(pilih == 1) enqueue();
    		if(pilih == 2) dequeue();
    		if(pilih == 3) showData();
	}
	while(pilih!=4);
	return 0;
}
