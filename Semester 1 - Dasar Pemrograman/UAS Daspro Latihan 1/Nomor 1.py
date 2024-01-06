print("Latihan UAS Dasar Pemrograman")
print("-----------------------------------------------")
print("Nama: Dicky Setiawan")
print("NIM: A11.2020.13089")
print("Kelompok: A11.4114")
print("----------------------------------------------")
print("Soal Nomor 1")
print("----------------------------------------------")

'''
Program dengan menggunakan List untuk menyimpan daftar nilai berikut ini :
7 8 9 1 4 0 3 5 2 6
Selanjutnya, ditampilkan nilai-nilai tersebut sehingga diperoleh hasil sebagai berikut :
8 7 1 9 0 4 5 3 6 2
'''

nilai = [7,8,9,1,4,0,3,5,2,6]
print(*[nilai[i+1] if i%2==0 else nilai[i-1] for i in range(len(nilai))])
print()