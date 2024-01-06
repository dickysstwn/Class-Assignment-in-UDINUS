print("Latihan UAS Dasar Pemrograman 2")
print("-----------------------------------------------")
print("Nama: Dicky Setiawan")
print("NIM: A11.2020.13089")
print("Kelompok: A11.4114")
print("----------------------------------------------")
print("Soal Nomor 2")
print("----------------------------------------------")

'''
Program sederhana untuk menampilkan array 2 dimensi dengan nested loop,
Contoh inputan :
Masukkan Jumlah Baris : 5
Masukkan Jumlah Kolom : 3
Masukkan nilai array [5][3] :
Baris 1 Kolom 1 : 1
Baris 1 Kolom 2 : 2
Baris 1 Kolom 3 : 3
……. (dst)
Baris 5 Kolom 1 : 13
Baris 5 Kolom 2 : 14
Baris 5 Kolom 3 : 15
'''

brs = int(input('Masukkan Baris : '))
klm = int(input('Masukkan Kolom : '))
n=1
for b in range(0,brs) :
   for k in range(0,klm) :
      print(n, end=" ")
      n+=1
   print(" ")