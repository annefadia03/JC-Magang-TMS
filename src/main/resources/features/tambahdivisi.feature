Feature: Tambah Divisi Admin
  Scenario: successful open tambah divisi page
    Given admin Already Logged in
    When admin click Master
    And admin Click menu
    Then Admin go to page tambah divisi

  Scenario: Add new Divisi
#    Given Admin on page tambah divisi
    When input new divisi
    And input on placeholder divisi
    And Simpan click
    Then Alert Berhasil Simpan

  Scenario: Function Entries data
    When click list dropdown entries
    Then  Choose 25 Entries data
    And Click List dropdown entries1
    Then  Choose 50 Entries data
    And  Click List dropdown entries2
    Then  Choose 100 Entries data

  Scenario: Search data
    When user click on search bar
    And user input keyword
    And Result searchbar

  Scenario: Function Button Download & Template
#   Given Admin on tambah divisi page
    When on click button download
    Then direct download template

  Scenario: Update Divisi
    When Click Icon Edit pen
    And  Edit Nama divisi area
    And  Click Update
    Then Sukses Update

  Scenario: Successful upload data
    Given Click Upload data button
    When select file
    And click save
    Then Alert Successfull upload data

  Scenario: Function paging Footer
    And click page 1
    Then  click page 2
    And click page 3
    Then  click prev
    And click next

  Scenario: AscDesc Tabel list divisi
    When click asc colomn Action
    And  click Desc Colomn Action
    And  Click Desc colom Nama Divisi
    Then Show Desc Data Colomn Nama Divisi
    And  Click Asc colomn nama Divisi


#  Scenario: Close Popup Upload Data
#    Given click upload data
#    When select file1
#    And click close popup
#    Then page tambah divisi











