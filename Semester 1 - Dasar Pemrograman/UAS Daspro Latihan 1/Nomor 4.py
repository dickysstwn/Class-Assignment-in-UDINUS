print("Latihan UAS Dasar Pemrograman")
print("-----------------------------------------------")
print("Nama: Dicky Setiawan")
print("NIM: A11.2020.13089")
print("Kelompok: A11.4114")
print("----------------------------------------------")
print("Soal Nomor 4")
print("----------------------------------------------")

'''
Buatlah program dengan menggunakan list sebagai berikut :
77 48 2 23 33 45 56 0 86 71
Selanjutnya program meminta inputan satu nilai dari keyboard, 
untuk dilakukan pencarian apakah nilai tersebut ada dalam list yang telah dibuat atau tidak. 
Jika data ditemukan maka akan menampilkan indeks data tersebut, jika tidak ditemukan maka akan menampilan data tidak ditemukan.
'''

angka = [77,48,2,23,33,45,56,0,86,71]

inputKeyboard = int(input('Data yang dicari : '))

# buat perulangan untuk semua angka
for i in range(len(angka)):
  # cek jika angka dari input ada di dalam variable angka
  if inputKeyboard == angka[i]:
    print('Data Ditemukan pada indeks {}'.format(i))