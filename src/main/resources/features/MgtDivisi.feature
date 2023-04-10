Feature: Login User Admin

  Scenario: BUKA HALAMAN MANAGEMENT DIVISI
    Given berada pada page login
    When klik Master
    And Klik Menu Mgt Divisi
    Then on Page MGT Divisi

  Scenario: FUNCTION DOWNLOAD MANAGEMENT DIVISI & TEMPLATE
    When klik download
    Then downloaded template

#  Scenario: FUNCTION UPLOAD DATA
#    When Klik Button Upload
#    And dropdown pilih divisi
#    And choosefile
#    And Save upload data
#    Then Alert Berhasil

  Scenario: ENTRIES DATA FUNCTION
    When klik list entries dropdown
    And  Pilih 25 Entries

  Scenario: FUNCTION SEARCH BAR
    When klik field search bar
    And  input keyword search
    And  hasil pencarian


  Scenario: EDIT MANAGEMENT DIVISI
    When  klik icon pensil data
    And   cek form nama divisi
    And   Cek NIK team leader
    And   Auto nama team leader
    Then  Simpan

  Scenario: DELETE DATA
    When  klik icon Trash
    Then  Alert popup

  Scenario: TAMBAH MANAGEMENT DIVISI
    When klik nama divisi area
    And  Pilih Divisi
    And  Ketik nama divisi
    And  Setuju pilihan
    And  Masukan NIK Team leader
    And  Autofill nama team leader
    Then Simpan data Tambah MGT Divisi