@US003_UI @SmokeTests
Feature: US002 registerpage

  Background: Ortak Stepler
    Given Medunna anasayfasina gidilir
    Then Account menu butonu tiklanir
    And Registration sayfasina gidilir

  @US003_TC01
  Scenario: US003_TC01
    Given New Password bolumune 3 karakterli bir sifre "<invalidSifre>" girilir
    Then Your password is required to be at least 4 characters. yazisinin goruldugu test edilir
    And New Password bolumune en az 4 karakterli bir sifre "<validSifre>" girilir
    And Your password is required to be at least 4 characters. yazisinin gorunmedigi test edilir


  @US003_TC02
  Scenario: US003_TC02
    Given New Password bolumune 7 karakterden az bir sifre "<7denAzSifre>" girilir
    Then Password strength seviyesinin 5 olmadigi test edilir


  @US003_TC03
  Scenario: US003_TC03
    Given New Password bolumune guclu sifre "<7ligucluSifre>" girilir
    Then Password strength seviyesinin 5 oldugu dogrulanir


  @US003_TC04
  Scenario: US003_TC04
    Given New Password bolumune 7 rakamli bir sifre "<7RakamliSifre>" girilir
    Then 7RakamliSifre'nin Password strength seviyesi tespit edilir
    And New Password bolumune 7 haneli rakam ve kucuk harfli sifre "<7liRakKucHarfliSifre>" girilir
    And En an bir kucuk harf eklenince password strength seviyesinin degistigi dogrulanir