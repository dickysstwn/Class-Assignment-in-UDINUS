print("Latihan UTS Dasar Pemrograman")
print("-----------------------------------------------")
print("Nama: Dicky Setiawan")
print("NIM: A11.2020.13089")
print("Kelompok: A11.4114")
print("----------------------------------------------")
print("Soal Nomor 1")
print("----------------------------------------------")

#Algoritma Pemrograman untuk Membuat Program Kalkulator Sederhana

print("Masukkan nilai. Apabila nilai yang dimasukkan >100, maka program akan otomatis keluar")
nilai1 = int(input('Masukkan Nilai = '))
if nilai1 > 100:
    print('Inputan maksimal adalah 100. Program keluar')
    quit()

nilai2 = int(input('Masukkan Nilai = '))
if nilai2 > 100:
    print('Inputan maksimal adalah 100. Program keluar')
    quit()
    
nilai3 = int(input('Masukkan Nilai = '))
if nilai3 > 100:
    print('Inputan maksimal adalah 100! Program keluar')
    quit()

print('Pilih Operasi')
print('Keterangan: (1) Penjumlahan (2) Pengurangan')
operasi1 = int(input('Pilih Operasi ke-1 = '))
operasi2 = int(input('Pilih Operasi ke-2 = '))

if operasi1 == 1:
    if operasi2 == 1:
        hasil = nilai1 + nilai2 + nilai3
        if hasil > 0:
            if hasil % 2 == 0:
                print('Hasil : {} + {} + {} = {} (Bilangan Genap Positif)' .format(nilai1,nilai2,nilai3,hasil))
            else:
                print('Hasil : {} + {} + {} = {} (Bilangan Ganjil Positif)' .format(nilai1,nilai2,nilai3,hasil))
        else:
            if hasil % 2 == 0:
                print('Hasil : {} + {} + {} = {} (Bilangan Genap Negatif)' .format(nilai1,nilai2,nilai3,hasil))
            else:
                print('Hasil : {} + {} + {} = {} (Bilangan Ganjil Negatif)' .format(nilai1,nilai2,nilai3,hasil))
    elif operasi2 == 2:
        hasil = nilai1 + nilai2 - nilai3
        if hasil > 0:
            if hasil % 2 == 0:
                print('Hasil : {} + {} - {} = {} (Bilangan Genap Positif)' .format(nilai1,nilai2,nilai3,hasil))
            else:
                print('Hasil : {} + {} - {} = {} (Bilangan Ganjil Positif)' .format(nilai1,nilai2,nilai3,hasil))
        else:
            if hasil % 2 == 0:
                print('Hasil : {} + {} - {} = {} (Bilangan Genap Negatif)' .format(nilai1,nilai2,nilai3,hasil))
            else:
                print('Hasil : {} + {} - {} = {} (Bilangan Ganjil Negatif)' .format(nilai1,nilai2,nilai3,hasil))
elif operasi1 == 2:
    if operasi2 == 1:
        hasil = nilai1 - nilai2 + nilai3
        if hasil > 0:
            if hasil % 2 == 0:
                print('Hasil : {} - {} + {} = {} (Bilangan Genap Positif)' .format(nilai1,nilai2,nilai3,hasil))
            else:
                print('Hasil : {} - {} + {} = {} (Bilangan Ganjil Positif)' .format(nilai1,nilai2,nilai3,hasil))
        else:
            if hasil % 2 == 0:
                print('Hasil : {} - {} + {} = {} (Bilangan Genap Negatif)' .format(nilai1,nilai2,nilai3,hasil))
            else:
                print('Hasil : {} - {} + {} = {} (Bilangan Ganjil Negatif)' .format(nilai1,nilai2,nilai3,hasil))
    elif operasi2 == 2:
        hasil = nilai1 - nilai2 - nilai3
        if hasil > 0:
            if hasil % 2 == 0:
                print('Hasil : {} - {} - {} = {} (Bilangan Genap Positif)' .format(nilai1,nilai2,nilai3,hasil))
            else:
                print('Hasil : {} - {} - {} = {} (Bilangan Ganjil Positif)' .format(nilai1,nilai2,nilai3,hasil))
        else:
            if hasil % 2 == 0:
                print('Hasil : {} - {} - {} = {} (Bilangan Genap Negatif)' .format(nilai1,nilai2,nilai3,hasil))
            else:
                print('Hasil : {} - {} - {} = {} (Bilangan Ganjil Negatif)' .format(nilai1,nilai2,nilai3,hasil))