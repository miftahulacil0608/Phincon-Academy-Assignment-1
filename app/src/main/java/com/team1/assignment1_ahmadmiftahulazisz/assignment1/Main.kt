package com.team1.assignment1_ahmadmiftahulazisz.assignment1

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main(){
    val personalFinance = PersonalFinance()

    do {
        println(personalFinance.numberOfBalance)
        println("===Personal Finance Application===")
        println("""
            Pilih menu dibawah ini:
                1. Tambah Pemasukan
                2. Tambah Pengeluaran
                3. Riwayat Transaksi
                4. Analisis Keuangan
                5. Keluar
        """.trimIndent())
        print("Input your choice: ")
        val inputMenuUser = readln()
        when(inputMenuUser){
            "1"->{
                personalFinance.addTransaction("Pemasukan")
            }
            "2"->{
                personalFinance.addTransaction("Pengeluaran")
            }
            "3"->{
                personalFinance.riwayatTransaksi()
            }
            "4"->{
                personalFinance.analysisOfMoney()
            }
            "5"->{
                println("Terima Kasih")
                break
            }
            else->{
                println("Inputan anda salah, tolong masukkan angka yang benar")
                runBlocking {
                    delay(2L)
                }
            }
        }
    }while (true)
}