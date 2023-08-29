@booking
Feature: Booking sayfasindaki gorevler yerine getirilir

  Scenario: Booking sitesindeki bolumden ilgili gorevler tamamlanarak dogrulama islemi yapilir

    * Kullanici "https://www.booking.com" sayfasina gider
    * Cookies i kabul eder
    * sag ust uc cizgi menuye tiklar
    * para birimi bolumunde degisiklik yaparak euro secer
    * sag ust uc cizgi menuye tiklar
    * dil i turkce olarak degistirir
    * arama bolume "antalya" yazilir ve arama yapilir
    * gelen otel puanin 7.0 den yuksek oldugu dogrulanir
    *  uygulama kapatilir