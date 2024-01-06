// Library
#include<iostream>
#include<conio.h>
#include<string.h>
#include<windows.h>
using namespace std;

// Pilihan untuk menu utama
int pilihan; 
struct Node{
char nama[30]; // Nama dengan maksimal 30 karakter
int umur; // Umur dengan tipe integer
Node *next = NULL;
};
Node *head= NULL; // Data yang ditampilkan pertama kali (kepala)
Node *tail= NULL; // Data yang ditampilkan terakhir (buntut)

// Menambahkan Data
void tambahData(){
Node *baru;
baru = new Node;
cout << "Masukan nama : "; cin >> baru->nama;
cout << "Masukan umur : "; cin >> baru->umur;
if (head == NULL){
head = baru;
head->next = NULL;
tail = head; }
else if (head->umur > baru->umur ){ // Mengurutkan data berdasar umur (dimulai dari yang terkecil (kepala) ke terbesar(buntut))
// Menambahkan data sebelum kepala
baru->next = head;
head = baru; }
else if(tail->umur < baru->umur){
// Menambahkan data setelah buntut 
tail->next = baru;
tail = baru;
tail->next = NULL; }
else{
// Menambah data di tengah (antara kepala dan buntut)
Node *bantu = head;
while(head != NULL){ 
if (bantu->next->umur > baru->umur){ // Menambah data umur yang sama, maka yang terbaru akan berada di bawah yang pertama
baru->next = bantu->next;
bantu->next = baru;
break;
}
else{
bantu=bantu->next; } } } }

// Menghapus Data
void hapusData(){
if(head == NULL){
// Jika belum ada data
cout << "Data masih kosong" << endl;
_getch();
}
else{
char hapus[30];
cout << "Masukan nama yang ingin dihapus: "; cin >> hapus;
Node *bantu=head;
if (strcmp(bantu->nama,hapus)==0){
// Jika kepala dihapus
head = bantu->next;
}
else{
while (bantu!=NULL){
if
((strcmp(bantu->next->nama,hapus)==0) && (strcmp(bantu->next->nama,tail->nama)==0))
// Jika buntut ingin dihapus
{
bantu->next = NULL;
tail = bantu;
break; }
else if (strcmp(bantu->next->nama,hapus)==0){
// jika ingin menghapus data di tengah
bantu->next = bantu->next->next;
break; }
else{
bantu = bantu->next; } } } } }

// Menampilkan Data
void display(){
Node *temp;
temp = head;
while (temp!=NULL) {
cout << "Nama\t: " << temp->nama << endl;
cout << "Umur\t: " << temp->umur<<"\n" << endl;
temp = temp->next; } }

int main(){
// Menu Utama
do
{
system("cls");
cout << "1. Menambahkan Data" << endl;
cout << "2. Menghapus Data" << endl;
cout << "3. Menampilkan Data" << endl;
cout << "4. Keluar" << endl;
cout << "Masukan Pilihan : ";cin >>pilihan;
if (pilihan == 1){
tambahData();
} else if (pilihan == 2){
hapusData();
}
else if (pilihan == 3){
display();
_getch();
} else{
break; }
} while (pilihan != 4);
return 0; }
