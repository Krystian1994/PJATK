# Konfiguracja środowiska – PJATK (Windows)

Na podstawie wytycznych BSS PJATK: https://bss.pja.edu.pl/docs/students/windows/

---

## ✅ Wykonane

| Element | Status | Szczegóły |
|---|---|---|
| VPN „PJATK VPN” | ✅ skonfigurowany | serwer `vpn.pjwstk.edu.pl`, protokół SSTP, MSCHAPv2, wyłączona brama domyślna (split tunneling) |
| Microsoft 365 (Office) | ✅ był już zainstalowany | — |
| Omnissa Horizon Client 8.19 | ✅ zainstalowany | zdalne pulpity i laboratoria |
| JetBrains Toolbox 3.8 | ✅ zainstalowany | do instalacji IntelliJ, PyCharm, Rider, CLion itd. |
| Visual Studio Community 2026 | ✅ zainstalowany | instalacja podstawowa, bez pakietów roboczych |

---

## 📋 Do zrobienia

> Większość kroków wymaga loginu studenckiego (`sXXXXXX`) i hasła do konta PJATK.

- [ ] **Restart komputera** – może być wymagany po instalacji Horizon Client.

- [ ] **Połączenie z VPN**
  1. Ustawienia (Win + I) → Sieć i Internet → VPN → **PJATK VPN** → Połącz
  2. Login: `sXXXXXX@pjwstk.edu.pl`
  3. Hasło: hasło do konta PJATK

- [ ] **Dyski sieciowe** (działają tylko przy połączonym VPN)
  - Z: (prywatny) – `\\win-zet.pjwstk.edu.pl\Users\sXXXXXX`
  - P: (publiczny) – `\\win-zet.pjwstk.edu.pl\public`
  - Folder WWW – `\\www.pjwstk.edu.pl\sXXXXXX`

- [ ] **Omnissa Horizon**
  1. Uruchom Horizon Client → **Dodaj serwer**
  2. Adres: `view.pjwstk.edu.pl`
  3. Zaloguj się danymi PJATK

- [ ] **Licencja JetBrains** – zgłoszenie ze studenckim mailem:
  https://www.jetbrains.com/community/education/#students

- [ ] **Microsoft 365** – zalogowanie kontem studenckim: https://o365.pjwstk.edu.pl/

- [ ] **Azure Dev Tools** (licencje Windows, Visio, Project): https://aka.ms/devtoolsforteaching

- [ ] **Visual Studio – pakiety robocze** (gdy będą potrzebne na zajęciach)
  Visual Studio Installer → **Modyfikuj** → np. „Programowanie aplikacji klasycznych .NET”, „Programowanie aplikacji klasycznych w C++”

- [ ] **Eduroam** (na terenie uczelni)
  - Login: `sXXXXXX@pjwstk.edu.pl`
  - Hasło: hasło do konta PJATK
  - Uwierzytelnianie: PEAP / MSCHAPv2
  - Certyfikat: certyfikaty systemowe

- [ ] *(opcjonalnie)* **Autodesk** (AutoCAD, 3ds Max, Maya) – głównie dla kierunków graficznych:
  https://www.autodesk.com/education/edu-software/overview

---

## 🆘 Pomoc

- E-mail: help@pjwstk.edu.pl
- Osobiście: dział BSS, budynek B, sala 204
- Pełna lista oprogramowania: https://bss.pja.edu.pl/docs/general/software/


