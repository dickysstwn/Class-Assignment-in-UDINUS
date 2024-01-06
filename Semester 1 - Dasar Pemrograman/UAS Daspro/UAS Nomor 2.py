print("Ujian Akhir Semester Dasar Pemrograman")
print("-----------------------------------------------")
print("Nama: Dicky Setiawan")
print("NIM: A11.2020.13089")
print("Kelompok: A11.4114")
print("----------------------------------------------")
print("Soal Nomor 2")
print("----------------------------------------------")

'''
Buatlah program dengan menggunakan inputan sejumlah n-data list. 
Selanjutnya program meminta inputan satu nilai dari keyboard, 
untuk dilakukan pencarian apakah nilai tersebut ada dalam list yang telah dibuat atau tidak. 
Jika data ditemukan maka akan menampilkan indeks data tersebut, jika tidak ditemukan maka akan menampilan data tidak ditemukan.
'''

n = int(input('Masukkan jumlah data = '))

list_num = []

for i in range(n):
    nilai = int(input("Masukkan data ke-{} = ".format(i+1)))
    list_num.append(nilai)

cari = int(input('Masukkan Data Yang Dicari : '))

print(*[f'Data {cari} ditemukan pada indeks {list_num.index(cari)}.' if cari in list_num else 'Data Tidak Ditemukan.'])