#include <iostream>
#include <stdlib.h>
#include <string.h>

using namespace std;

//Mendefinisikan node dengan struct
struct Node{
    char nama[30];
    int umur;
    Node *next;
    Node *prev;
};

//Membuat node baru dengan nama head dan tail
Node *head, *tail;

void init(){
	head=NULL;
	tail=NULL;
}

//Mendefinisikan prosedur untuk menambah data di depan
void tambahDepan(){
	char a[30];
	int b;
	
	//Masukkan datanya
	cout<<" Masukkan Nama : "; cin>>a;
	cout<<" Masukkan Umur : "; cin>>b;
	
	//Membuat node baru
	Node *baru;
	baru=new Node;
	
	//Memasukkan data ke node baru
	strcpy(baru->nama,a);
	baru->umur=b;

	baru->prev=NULL;
	baru->next=head;
	
	if(head==NULL){ //Kondisi list kosong
		head=baru;	
		head->next=NULL;
   		head->prev=NULL;
		tail=head;
	}
	else{ //Kondisi list tidak kosong
		head->prev=baru;
		baru->next=head;
		head=baru;
	}
}

//Mendefinisikan prosedur untuk menambah data di tengah sebelum data tertentu
void tambahTengahSebelum(){
	char a[30];
	int b;

	//Masukkan datanya
	cout<<" Masukkan nama : "; cin>>a;
	cout<<" Masukkan umur : "; cin>>b;
	
	//Membuat node baru
	Node *baru;
	baru=new Node;
	
	//Memasukkan data ke node baru
	strcpy(baru->nama,a);
	baru->umur=b;
	
	if(head==NULL){ 
		head=baru;	
		head->next=NULL;
   		head->prev=NULL;
		tail=head;
	}
	else{
		char cari[30];
		Node *bantu=head;
		
		//Menambahkan data di tengah sebelum data
		cout<<" Tambah data sebelum : "; cin>>cari;
		while(bantu!=NULL){
			if(strcmp(cari, bantu->nama)==0){
				if(bantu==head){
					head->prev=baru;
					baru->next=head;
					baru->prev=NULL;
					head=baru;
				}
				else{
					bantu->prev->next=baru;
					baru->prev=bantu->prev;
					baru->next=bantu;
					bantu->prev=baru;
				}
				break;
			}
			bantu=bantu->next;
		}
	}
}

//Mendefinisikan prosedur untuk menambah data di tengah setelah data tertentu
void tambahTengahSetelah(){
	char a[30];
	int b;

	//Masukkan datanya
	cout<<" Masukkan nama : "; cin>>a;
	cout<<" Masukkan umur : "; cin>>b;
	
	//Membuat node baru
	Node *baru;
	baru=new Node;
	
	//Memasukkan data ke node baru
	strcpy(baru->nama,a);
	baru->umur=b;
	
	if(head==NULL){
		head=baru;	
		head->next=NULL;
   		head->prev=NULL;
		tail=head;
	}
	else{
		char cari[30];
		Node *bantu=head;
		
		//Menambahkan data di tengah setelah data
		cout<<" Tambah data setelah : "; cin>>cari;
		while(bantu!=NULL){
			if(strcmp(cari, bantu->nama)==0){
				if(bantu==head){
					head->prev=baru;
					baru->next=head;
					baru->prev=NULL;
					head=baru;
				}
				else{
					bantu->next->prev=baru;
					baru->next=bantu->next;
					baru->prev=bantu;
					bantu->next=baru;
				}
				break;
			}
			bantu=bantu->next;
		}
	}
}

//Mendefinisikan prosedur untuk menambah data di belakang
void tambahBelakang(){
	char a[30];
	int b;
	
	//Masukkan datanya
	cout<<" Masukkan nama : "; cin>>a;
	cout<<" Masukkan umur : "; cin>>b;

	//Membuat node baru
	Node *baru;
	baru=new Node;

	//Memasukkan data ke node baru
	strcpy(baru->nama,a);
	baru->umur=b;

	if(head==NULL){ //Kondisi list kosong
		head=baru;	
		head->next=NULL;
   		head->prev=NULL;
		tail=head;
	}
	else{ //Kondisi list tidak kosong
		tail->next=baru;
   		baru->prev=tail;
		tail=baru;
	}
}

//Mendefinisikan prosedur untuk menghapus data di depan
void hapusDepan(){
	if(head==NULL){ //Konsisi list kosong
		cout<<" Tidak ada data!"<<endl;
	}
	else if(head==tail){ //Kondisi list tidak kosong
		Node *bantu=head;
		
		cout<<" Data yang dihapus : "<<bantu->nama<<" ["<<bantu->umur<<"]"<<endl;
		
		delete head;
		head=NULL;
		tail=NULL;
	}
	else{
		Node *hapus=head;
		
		cout<<" Data yang dihapus : "<<hapus->nama<<" ["<<hapus->umur<<"]"<<endl;
		
		head=head->next;
		head->prev=NULL;
		delete hapus;
	}
}

//Mendefinisikan prosedur untuk menghapus data di tengah
void hapusTengah(){
	if(head==NULL){ //Kondisi list kosong
		cout<<" Tidak ada data!"<<endl;
	}
	else if(head==tail){ //Kondisi list tidak kosong
		Node *bantu=head;
		
		cout<<" Data yang dihapus : "<<bantu->nama<<" ["<<bantu->umur<<"]"<<endl;
		
		delete head;
		head=NULL;
		tail=NULL;
	}
	else{
		char cari[30];
		Node *bantu=head;
		
		cout<<" Cari data yang ingin dihapus : "; cin>>cari;
		bantu=bantu->next;
		
		while(bantu!=NULL){
			if(strcmp(cari, bantu->nama)==0){
				cout<<" Data yang dihapus : "<<bantu->nama<<" ["<<bantu->umur<<"]"<<endl;
				bantu->next->prev=bantu->prev;
				bantu->prev->next=bantu->next;
				delete bantu;
			}
			else{
				cout<<" Data tidak ditemukan!"<<endl;
			}
			break;
		}
	}
}

//Mendefinisikan prosedur untuk menghapus data di belakang
void hapusBelakang(){
	if(head==NULL){ //Kondisi list kosong
		cout<<" Tidak ada data!"<<endl;
	}
	else if(head==tail){ //Kondisi list tidak kosong
		Node *bantu=head;
		
		cout<<" Data yang dihapus : "<<bantu->nama<<" ["<<bantu->umur<<"]"<<endl;
		
		delete head;
		head=NULL;
		tail=NULL;
	}
	else{
		Node *hapus=tail;
		
		cout<<" Data yang dihapus : "<<hapus->nama<<" ["<<hapus->umur<<"]"<<endl;

		tail=tail->prev;
		tail->next=NULL;
		delete hapus;
	}
}

//Mendefinisikan prosedur untuk menampilkan data mundur
void tampilMundur(){
	Node *bantu=tail;
	
	cout<<" NULL -> ";
	while(bantu!=NULL){
		cout<<bantu->nama<<" ["<<bantu->umur<<"]"<<" -> ";
		bantu=bantu->prev;
	} cout<<"NULL"<<endl;
}

//Mendefinisikan prosedur untuk menampilkan data maju
void tampilMaju(){
	Node *bantu=tail;
	
	cout<<" NULL <- ";
	while(bantu!=NULL){
		cout<<bantu->nama<<" ["<<bantu->umur<<"]"<<" <- ";
		bantu=bantu->prev;
	} cout<<"NULL"<<endl;
}

//Menampilkan menu pilihan
main(){
    int pilih;
    
    do{
        cout<<endl;
        cout<<" +--------------------------+"<<endl;
        cout<<" |    DUOBLE LINKED LIST    |"<<endl;
        cout<<" +--------------------------+"<<endl;
        cout<<" | 1. Tambah Depan          |"<<endl;
        cout<<" | 2. Tambah Tengah-Sebelum |"<<endl;
        cout<<" | 3. Tambah Tengah-Setelah |"<<endl;
        cout<<" | 4. Tambah Belakang       |"<<endl;
        cout<<" | 5. Hapus Depan           |"<<endl;
        cout<<" | 6. Hapus Tengah          |"<<endl;
        cout<<" | 7. Hapus Belakang        |"<<endl;
        cout<<" | 8. Tampil Data Maju      |"<<endl;
        cout<<" | 9. Tampil Data Mundur    |"<<endl;
        cout<<" | 0. Keluar                |"<<endl;
        cout<<" +--------------------------+"<<endl;
        cout<<" Masukan Pilihan Anda : "; cin>>pilih;
     	
		if(pilih==1) tambahDepan();
		if(pilih==2) tambahTengahSebelum();
		if(pilih==3) tambahTengahSetelah();
		if(pilih==4) tambahBelakang();
		if(pilih==5) hapusDepan();
		if(pilih==6) hapusTengah();
		if(pilih==7) hapusBelakang();
		if(pilih==8) tampilMaju();
		if(pilih==9) tampilMundur();
	}
	while(pilih!=0);	
	return 0;
}
