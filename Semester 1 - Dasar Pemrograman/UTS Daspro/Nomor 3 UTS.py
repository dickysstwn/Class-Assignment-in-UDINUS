print("UTS Dasar Pemrograman")
print("-----------------------------------------------")
print("Nama: Dicky Setiawan")
print("NIM: A11.2020.13089")
print("Kelompok: A11.4114")
print("----------------------------------------------")
print("Soal Nomor 3")
print("----------------------------------------------")

nama = input('Nama :')
ipk = float(input('IPK :'))
if ipk < 3.00:
    print('Mohon maaf anda tidak diterima')
    quit()
akreditasi = input('Akreditasi Universitas :')
if akreditasi == 'A':
    print()
else:
    quit()
akademik = int(input('Tes Akademik :'))
ketrampilan = int(input('Tes Ketrampilan :'))
psikologi = int(input('Tes Psikologi :'))

#algoritma
rata_rata = (akademik + ketrampilan + psikologi) / 3
print(rata_rata)

if psikologi < akademik > ketrampilan:
    bagian = 'manajemen'
elif psikologi < ketrampilan > akademik:
    bagian = 'produksi'
else:
    bagian = 'pemasaran'

if akademik < 80:
    print('maaf anda tidak diterima karena ada nilai dibawah 80')
if ketrampilan < 80:
    print('maaf anda tidak diterima karena ada nilai dibawah 80')
if psikologi < 80:
    print('maaf anda tidak diterima karena ada nilai dibawah 80')
elif rata_rata >= 80:
    print('Selamat anda diterima di bagian', bagian)
else:
    print('Anda tidak diterima karena rata2 kurang dari 80')