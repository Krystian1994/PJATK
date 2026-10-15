---
skrot: AM
zajecia:
  - wykład
  - ćwiczenia
tags:
  - pjatk
  - przedmiot
---
# AM – Analiza matematyczna

| Rodzaj | Grupa | Termin | Sala |
|---|---|---|---|
| Wykład | WIn I.1 - 1w | sobota 10:15–11:45 | B/1 Aula Główna |
| Ćwiczenia | WIn I.1 - 25c | niedziela 08:30–10:00 | B/208 |

## Wykłady

### W0 – Powtórzenie: funkcje elementarne

Materiały: [[W0_funkcje_powtorzenie.pdf|Wykład 0 (PDF)]] · [[Z00 powtorzenie funkcje.pdf|Zadania Z00 (PDF)]] · [[Z00 powtorzenie funkcje_Rozwiazania.pdf|Rozwiązania Z00 (PDF)]]

> [!abstract] Co to są „funkcje elementarne”?
> To nie jest nic nowego do nauczenia, tylko **nazwa** na funkcje, które już znasz ze szkoły. Tytuł wykładu znaczy po prostu: „Powtórzenie: znane funkcje ze szkoły”.
>
> **Jak klocki LEGO:**
> - **Klocki:** $x^2$, $\sqrt{x}$, $2^x$, $\log x$, $\sin x$, $\arcsin x$ i tak dalej.
> - Z klocków budujesz, co chcesz, za pomocą $+$, $-$, $\cdot$, $:$ i wkładania jednej funkcji w drugą. Na przykład $\sqrt{x^2+1}$ albo $\sin x + \log x$.
> - Wszystko, co zbudujesz z tych klocków, to **funkcja elementarna**. Tyle.
>
> **Jak to sprawdzić:** patrzysz na wzór i pytasz, czy jest zrobiony tylko ze znanych klocków.
> - $x^3 - 5x$: tak, jest elementarna.
> - $\dfrac{\sin x}{x^2+1}$: tak, jest elementarna.
> - Prawie każda funkcja, jaką zobaczysz na AM: tak.
>
> **Po co ktoś to nazwał?** Żeby na wykładzie dało się powiedzieć jednym zdaniem: „funkcje elementarne zachowują się porządnie”. Wykres nie ma dziur ani skoków tam, gdzie funkcja istnieje, a przy granicach często wystarczy wstawić liczbę do wzoru. Nie trzeba tego mówić osobno dla każdej funkcji.

> [!abstract]- Dokładniej: lista klocków i definicja
> **Podstawowe funkcje elementarne** (klocki) i rozdziały, w których są omówione:
>
> | Rodzaj | Przykłady | Rozdział |
> |---|---|---|
> | stałe | $5$, $-2$, $\pi$ | – |
> | potęgowe (też pierwiastki) | $x^2$, $x^3$, $\sqrt{x} = x^{1/2}$, $\frac1x = x^{-1}$ | [[#1. Potęgi i funkcja wykładnicza\|1]] |
> | wykładnicze | $2^x$, $e^x$ | [[#1. Potęgi i funkcja wykładnicza\|1]] |
> | logarytmiczne | $\log_2 x$, $\ln x$ | [[#2. Logarytmy\|2]] |
> | trygonometryczne | $\sin x$, $\cos x$, $\operatorname{tg} x$, $\operatorname{ctg} x$ | [[#5. Trygonometria\|5]] |
> | cyklometryczne (arcusy) | $\arcsin x$, $\arccos x$, $\operatorname{arctg} x$ | [[#6. Funkcje cyklometryczne (arcusy)\|6]] |
>
> **Definicja:** funkcja elementarna to każda funkcja, którą da się otrzymać z klocków **skończoną** liczbą działań: dodawania, odejmowania, mnożenia, dzielenia i **składania** ([[#9. Złożenie funkcji|rozdział 9]]).
>
> **Co nie jest elementarne?** Na przykład część całkowita $\lfloor x \rfloor$ (zaokrąglenie w dół, np. $\lfloor 2{,}7 \rfloor = 2$). Ma „schodki”, których nie da się złożyć z klocków.
>
> **Twierdzenie, dla którego ta nazwa istnieje:** każda funkcja elementarna jest **ciągła w swojej dziedzinie**. Pojawi się przy granicach i ciągłości.

> [!info] Jak się uczyć z tej notatki
> **Czytaj po kolei, od góry do dołu.** Rozdziały są ułożone w kolejności zadań z Z00. Każdy rozdział korzysta tylko z tego, co było wcześniej.
>
> Na końcu rozdziału jest zielona ramka **➡️ Teraz zrób**. Kliknij link, zrób zadanie (najpierw sam na kartce, potem rozwiń rozwiązanie i porównaj), a potem wróć i czytaj dalej.
>
> | Rozdziały | Potem zadania |
> |---|---|
> | 0 Symbole, 1 Potęgi, 2 Logarytmy | 1 |
> | 3 Równania | 2 |
> | 4 Nierówności | 3 |
> | 5 Trygonometria, 6 Arcusy | 4, 5, 6* |
> | 7 Funkcja, 8 Dziedzina | 7, 8 |
> | 9 Złożenie | 9, 10 |
> | 10 Funkcja odwrotna | 11* |
>
> Na kolokwium **zawsze uzasadniaj** (wymóg prowadzącego): pisz, z jakiej własności korzystasz.

---

#### 0. Słowniczek symboli

Tylko przejrzyj. Wracaj tu, gdy trafisz na nieznany znak.

| Symbol | Czytamy | Przykład |
|---|---|---|
| $\in$ | „należy do” | $2 \in \mathbb{R}$ |
| $\forall$ | „dla każdego” | $\forall x:\ x^2 \ge 0$ |
| $\exists$ | „istnieje” | $\exists x:\ x^2 = 4$ |
| $\Rightarrow$ | „jeżeli…, to…” | $x>2 \Rightarrow x>1$ |
| $\Leftrightarrow$ | „wtedy i tylko wtedy” (równoważne) | $x^2=4 \Leftrightarrow x=2 \lor x=-2$ |
| $\lor$ / $\land$ | „lub” / „i” | |
| $\cup$ / $\cap$ | suma / część wspólna zbiorów | $(-\infty,1)\cup(3,\infty)$ |
| $\setminus$ | „bez” | $\mathbb{R}\setminus\{0\}$ = wszystkie liczby oprócz 0 |
| $\mathbb{R}$, $\mathbb{Z}$ | liczby rzeczywiste, całkowite | w wykładzie całkowite to też $I$ |
| $(a,b)$ | przedział **otwarty**: końce **nie** należą | $(0,1)$ nie zawiera 0 ani 1 |
| $[a,b]$ | przedział **domknięty**: końce należą | $[0,1]$ zawiera 0 i 1 |
| $f(x)$ | „$f$ od $x$”: wynik funkcji $f$ dla liczby $x$ | $f(x) = x^2$, więc $f(3) = 9$ |

> [!tip] Nawias przy nieskończoności
> Przy $\infty$ zawsze jest nawias okrągły: $[0, \infty)$. Nieskończoność to nie liczba, więc nie może „należeć” do przedziału.

---

#### 1. Potęgi i funkcja wykładnicza

**Potęga** $a^p$ to $a$ pomnożone przez siebie $p$ razy, np. $2^3 = 2\cdot2\cdot2 = 8$. Dla innych wykładników (ujemnych, ułamkowych) obowiązują wzory poniżej.

**Prawa działań na potęgach:**

| # | Wzór | Przykład |
|---|---|---|
| 1 | $a^0 = 1$ | $7^0 = 1$ |
| 2 | $a^{-p} = \dfrac{1}{a^p}$ | $2^{-3} = \frac{1}{8}$ |
| 3 | $a^{1/p} = \sqrt[p]{a}$ | $8^{1/3} = \sqrt[3]{8} = 2$, $\ 4^{1/2} = \sqrt4 = 2$ |
| 4 | $(a^p)^q = a^{pq}$ | $(9^7)^x = 9^{7x}$ |
| 5 | $(ab)^p = a^p b^p$ | $(2\cdot3)^2 = 4\cdot 9$ |
| 6 | $a^p \cdot a^q = a^{p+q}$ | $5^x \cdot 5^2 = 5^{x+2}$ |
| 7 | $\dfrac{a^p}{a^q} = a^{p-q}$ | $\frac{3^{2x}}{3} = 3^{2x-1}$ |

> [!warning] Częste błędy
> - $a^p + a^q \ne a^{p+q}$. Dodawanie potęg **nie ma** prostego wzoru.
> - $(a+b)^2 \ne a^2 + b^2$.

**Funkcja wykładnicza** to potęga, w której zmienna $x$ jest w **wykładniku**:
$$f(x) = a^x,\quad a > 0,\ a \ne 1$$
Dziedzina: $\mathbb{R}$ (każdy wykładnik wolno wstawić). Zbiór wartości: $(0, \infty)$.

> [!important] Kluczowy fakt
> $a^x > 0$ **zawsze**. Funkcja wykładnicza nigdy nie jest zerem ani liczbą ujemną. Np. $2^{-10} = \frac{1}{1024}$ jest małe, ale wciąż dodatnie.

**Wykres:**
- $a > 1$ (np. $2^x$, $10^x$): ściśle **rośnie**, przechodzi przez $(0, 1)$ (bo $a^0 = 1$), z lewej coraz bliżej osi poziomej, ale jej nie dotyka,
- $0 < a < 1$ (np. $(\frac12)^x = 2^{-x}$): ściśle **maleje**, to lustrzane odbicie poprzedniego.

> [!tip] Liczba $e \approx 2{,}718$
> $e^x$ to najważniejsza funkcja wykładnicza w analizie. Spotkasz ją w zadaniu 8f.

---

#### 2. Logarytmy

> [!important] Definicja (zapamiętaj na zawsze)
> $$\log_a b = c \quad\Longleftrightarrow\quad a^c = b$$
> Logarytm odpowiada na pytanie: **„do jakiej potęgi podnieść $a$, żeby dostać $b$?”**
> Warunki: podstawa $a > 0,\ a \ne 1$, liczba logarytmowana $b > 0$.

Przykłady:
- $\log_4 16 = 2$, bo $4^2 = 16$
- $\log_4 \frac14 = -1$, bo $4^{-1} = \frac14$ (wzór 2 z rozdziału 1)
- $\log_4 2 = \frac12$, bo $4^{1/2} = \sqrt4 = 2$ (wzór 3 z rozdziału 1)

> [!note] Dlaczego $b > 0$?
> $a^c$ jest **zawsze dodatnie** (rozdział 1). Nie istnieje więc potęga dająca $0$ albo liczbę ujemną, a zatem $\log_2(-4)$ i $\log_2 0$ nie istnieją.

Oznaczenia: $\ln x = \log_e x$ (logarytm naturalny), $\log_{10}$ często zapisuje się samo jako $\log$.

**Logarytm i potęga znoszą się nawzajem** (to najczęściej używane wzory w zadaniu 1):
$$a^{\log_a x} = x \qquad \log_a(a^x) = x$$

Dlaczego: $\log_a x$ to „potęga, do której podnosisz $a$, żeby dostać $x$”. Jeśli rzeczywiście podniesiesz $a$ do tej potęgi, dostaniesz $x$.

**Wartości warte zapamiętania:** $\log_a 1 = 0$ (bo $a^0 = 1$), $\log_a a = 1$ (bo $a^1 = a$).

**Prawa działań:**

| # | Wzór | Słownie |
|---|---|---|
| 1 | $\log_a(xy) = \log_a x + \log_a y$ | log iloczynu = suma logów |
| 2 | $\log_a\frac{x}{y} = \log_a x - \log_a y$ | log ilorazu = różnica logów |
| 3 | $\log_a(x^r) = r\log_a x$ | wykładnik „schodzi” przed log (i odwrotnie: liczba sprzed logu wchodzi do wykładnika) |
| 4 | $\log_a x = \dfrac{\log_b x}{\log_b a}$ | zmiana podstawy |
| 4' | $\log_a b = \dfrac{1}{\log_b a}$ | szczególny przypadek wzoru 4 |

> [!question]- Wzór 4 (zmiana podstawy) łopatologicznie
> **Po co:** masz logarytm o „niewygodnej” podstawie $a$ i chcesz go zamienić na logarytmy o podstawie, którą lubisz ($b$). $b$ wybierasz **sam**, dowolnie (byle $b > 0$, $b \ne 1$).
>
> **Jak:** $\log_a x = \dfrac{\log_b x}{\log_b a}$. Na górze stoi to, co było **w środku** ($x$), na dole to, co było **w podstawie** ($a$). Oba logarytmy mają tę samą, nową podstawę $b$.
>
> **Przykład 1, „ładne” liczby:** $\log_4 8 = ?$ Nie widać od razu, ale $4$ i $8$ to potęgi dwójki, więc bierzesz $b = 2$:
> $$\log_4 8 = \frac{\log_2 8}{\log_2 4} = \frac{3}{2}$$
> Sprawdzenie: $4^{3/2} = (\sqrt4)^3 = 2^3 = 8$ ✓
>
> **Przykład 2, kalkulator:** kalkulator ma tylko $\log$ (podstawa 10) i $\ln$ (podstawa $e$). Jak policzyć $\log_3 7$?
> $$\log_3 7 = \frac{\ln 7}{\ln 3} \approx \frac{1{,}946}{1{,}099} \approx 1{,}77$$
> (Z $\log$ zamiast $\ln$ wyjdzie to samo.)
>
> **Skąd wzór 4':** wstaw $x = b$. Wtedy $\log_a b = \dfrac{\log_b b}{\log_b a} = \dfrac{1}{\log_b a}$, bo $\log_b b = 1$. Przykład: $\log_5 4 = \dfrac{1}{\log_4 5}$ (zadanie 1 l).
>
> **Pułapka:** $\dfrac{\log_b x}{\log_b a}$ to **dzielenie dwóch logarytmów**, a nie $\log_b \frac{x}{a}$. To dwie różne rzeczy.

> [!tip] Typowe „sztuczki” w zadaniach
> - **Liczba sprzed logu do wykładnika** (wzór 3): $2^{3\log_2 7} = 2^{\log_2 7^3} = 7^3$
> - **Rozbijanie wykładnika sumy** (wzór 6 z rozdz. 1): $5^{x + \log_5 2} = 5^x \cdot 5^{\log_5 2} = 2\cdot 5^x$
> - **Minus w wykładniku** (wzór 2 z rozdz. 1): $7^{-\log_7 x} = \dfrac{1}{7^{\log_7 x}} = \dfrac{1}{x}$
> - **Porównywanie z 1:** $\log_4 5 > 1$, bo $5 > 4$, a $\log_4 4 = 1$

**Funkcja logarytmiczna** $f(x) = \log_a x$, dziedzina $(0, \infty)$, zbiór wartości $\mathbb{R}$:
- dla $a > 1$ ściśle **rosnąca**, dla $0 < a < 1$ ściśle **malejąca**,
- przechodzi przez $(1, 0)$, bo $\log_a 1 = 0$,
- jej wykres to odbicie wykresu $a^x$ względem prostej $y = x$.

> [!note] Hierarchia wzrostu
> Dla typowych podstaw ($a = 2, e, 3, 10$) i dużych $x$:
> $$\log_a x \;<\; x \;<\; a^x$$
> Logarytm rośnie „najwolniej”, a wykładnicza „najszybciej”. Wzór z kartki z zadaniami ($a > 1$) jest uproszczeniem: dla wszystkich $x$ działa, gdy $a > e^{1/e} \approx 1{,}44$. To będzie ważne przy **granicach**.

> [!success] ➡️ Teraz zrób
> [[#Zadanie 1 – wartości logarytmów i potęg|Zadanie 1]]. Potem wróć i czytaj rozdział 3.

---

#### 3. Wielomiany i równania

**Wielomian** to suma potęg $x$ pomnożonych przez liczby, np. $3x^4 - 2x + 7$. Ogólnie:
$$f(x) = a_n x^n + a_{n-1}x^{n-1} + \dots + a_1 x + a_0$$
Można do niego wstawić każdą liczbę.

Kształty potęg $x^n$:
- $n$ **parzyste** ($x^2, x^4$): kształt litery U, oba ramiona w górę,
- $n$ **nieparzyste** ($x, x^3, x^5$): z lewej na dole, z prawej u góry, cały czas rośnie.

##### 3.1 Równanie kwadratowe $ax^2 + bx + c = 0$

$$\Delta = b^2 - 4ac, \qquad x_{1,2} = \frac{-b \pm \sqrt{\Delta}}{2a}$$

| $\Delta$ | Liczba rozwiązań |
|---|---|
| $> 0$ | dwa: $x_1 \ne x_2$ |
| $= 0$ | jedno (podwójne): $x_0 = -\frac{b}{2a}$ |
| $< 0$ | brak; wtedy wyrażenie ma **stały znak**, taki jak znak $a$ |

> [!example] $x^2 + 6x + 8 = 0$
> $a = 1,\ b = 6,\ c = 8$. $\Delta = 36 - 32 = 4$, $\sqrt\Delta = 2$.
> $x_1 = \frac{-6 + 2}{2} = -2$, $\ x_2 = \frac{-6 - 2}{2} = -4$.

> [!tip] Wierzchołek paraboli
> $x_w = -\frac{b}{2a}$. Dla $a > 0$ to miejsce **najmniejszej** wartości. Przyda się w zad. 7e.

##### 3.2 Iloczyn równy zero

$$A \cdot B = 0 \Leftrightarrow A = 0 \lor B = 0$$

Uwaga na czynniki, które **nigdy nie są zerem**: $2^x > 0$ zawsze (rozdz. 1), $x^2 + 10 > 0$ zawsze, wyrażenie kwadratowe z $\Delta < 0$ i $a > 0$ jest zawsze dodatnie. Takie czynniki można w równaniu pominąć.

##### 3.3 Ułamek równy zero

$$\frac{L}{M} = 0 \Leftrightarrow L = 0 \ \land\ M \ne 0$$

Ułamek jest zerem, gdy **licznik** jest zerem. Mianownik nie może być zerem, bo przez zero się nie dzieli.

> [!success] ➡️ Teraz zrób
> [[#Zadanie 2 – równania|Zadanie 2]]. Potem wróć i czytaj rozdział 4.

---

#### 4. Nierówności

##### 4.1 Funkcje rosnące i malejące (monotoniczność)

Intuicja: idziesz po wykresie **w prawo**. Jeśli idziesz pod górę, funkcja rośnie. Jeśli w dół, maleje.

| Nazwa | Definicja: dla dowolnych $x_1 < x_2$ |
|---|---|
| ściśle rosnąca | $f(x_1) < f(x_2)$ (większy argument → większa wartość) |
| ściśle malejąca | $f(x_1) > f(x_2)$ (większy argument → mniejsza wartość) |
| rosnąca (niemalejąca) | $f(x_1) \le f(x_2)$ (może też stać w miejscu) |
| malejąca (nierosnąca) | $f(x_1) \ge f(x_2)$ |

> [!important] Do czego to służy: nierówności
> Jeśli $f$ jest **ściśle rosnąca**, możesz ją „nałożyć” na obie strony nierówności albo ją „zdjąć” **bez zmiany znaku**:
> $$a < b \Leftrightarrow f(a) < f(b)$$
> Jeśli $f$ jest **ściśle malejąca**, znak nierówności **się odwraca**:
> $$a < b \Leftrightarrow f(a) > f(b)$$

Które funkcje znasz już jako rosnące:
- $x^3$, $x^5$, $x^9$, … (potęgi nieparzyste), $\sqrt{x}$
- $a^x$ i $\log_a x$ dla $a > 1$ (dla $0 < a < 1$ malejące)
- $x^2$ **nie jest** monotoniczna na całej osi: maleje na $(-\infty, 0]$, rośnie na $[0, \infty)$

> [!example] $x^9 < 1$
> $1 = 1^9$, a $x^9$ jest rosnąca, więc zdejmujemy potęgę bez zmiany znaku: $x < 1$.

##### 4.2 Nierówności wielomianowe – metoda wężyka

Przykład: $(x+1)(x^2 - 4) \le 0$

1. **Rozłóż na czynniki:** $(x+1)(x-2)(x+2) \le 0$.
2. **Miejsca zerowe:** $-2,\ -1,\ 2$. Zaznacz je na osi w kolejności rosnącej.
3. **Start z prawej strony:** jeśli liczba przy najwyższej potędze jest dodatnia, zaczynasz **nad** osią.
4. **Rysuj wężyk** od prawej do lewej przez kolejne miejsca zerowe:
   - zwykły czynnik, np. $(x-2)$: wężyk **przecina** oś,
   - czynnik do kwadratu (lub innej parzystej potęgi), np. $(x+2)^2$: wężyk **odbija się** od osi, nie przecina jej.
5. **Odczytaj:** dla $> 0$ / $\ge 0$ bierzesz przedziały nad osią, dla $< 0$ / $\le 0$ pod osią. Przy $\le$, $\ge$ dołącz miejsca zerowe (nawias kwadratowy).

```
znak:    −      +      −      +
     ────────●──────●──────●────────► x
            -2     -1      2
```

Odpowiedź: $x \in (-\infty, -2] \cup [-1, 2]$.

> [!example] Przykłady z wykładu
> - $x^2 + 5x + 6 > 0$: miejsca zerowe $-3, -2$, parabola ramionami w górę → $x \in (-\infty,-3)\cup(-2,\infty)$
> - $(x-1)(x-2)(x-3) \ge 0$ → $x \in [1,2] \cup [3,\infty)$
> - $(x-1)(x-2)(x-3)(x-4) \ge 0$ → $x \in (-\infty,1] \cup [2,3] \cup [4,\infty)$

Czynniki zawsze dodatnie ($2^x$, $x^2 + 10$) można pominąć, bo nie zmieniają znaku.

##### 4.3 Nierówności z ułamkiem

$$\frac{L}{M} < 0 \Leftrightarrow L \cdot M < 0 \quad (\text{i } M \ne 0)$$

Ułamek i iloczyn mają ten sam znak (plus przez minus i plus razy minus dają minus). Zamieniasz ułamek na iloczyn i używasz wężyka.

> [!warning] Nie mnóż nierówności przez mianownik!
> Nie wiesz, czy mianownik jest dodatni, czy ujemny. Gdyby był ujemny, znak musiałby się odwrócić.

##### 4.4 Nierówności z logarytmem

> [!example] $\log_5(5 - 3x) > 1$
> 1. **Warunek logarytmu** (rozdz. 2): $5 - 3x > 0 \Leftrightarrow x < \frac53$.
> 2. **Prawą stronę zapisz jako log:** $1 = \log_5 5$.
> 3. $\log_5(5-3x) > \log_5 5$. $\log_5$ jest rosnący (podstawa $5 > 1$), więc zdejmujemy go bez zmiany znaku: $5 - 3x > 5 \Leftrightarrow x < 0$.
> 4. **Oba warunki naraz:** $x < 0$ i $x < \frac53$, więc $x \in (-\infty, 0)$.

> [!success] ➡️ Teraz zrób
> [[#Zadanie 3 – nierówności|Zadanie 3]]. Potem wróć i czytaj rozdział 5.

---

#### 5. Trygonometria

##### 5.1 Kąty w radianach

Sinus i cosinus to funkcje **kąta**. W analizie kąty mierzymy w **radianach**, nie w stopniach.
$$\pi\ \text{rad} = 180^\circ \qquad\Rightarrow\qquad 1^\circ = \frac{\pi}{180}\ \text{rad}$$

| Stopnie | 0° | 30° | 45° | 60° | 90° | 180° | 270° | 360° |
|---|---|---|---|---|---|---|---|---|
| Radiany | $0$ | $\frac{\pi}{6}$ | $\frac{\pi}{4}$ | $\frac{\pi}{3}$ | $\frac{\pi}{2}$ | $\pi$ | $\frac{3\pi}{2}$ | $2\pi$ |

> [!warning] Liczba bez $\pi$ to też radiany!
> $\sin\frac12$ to sinus kąta $0{,}5$ rad $\approx 28{,}6^\circ$, a **nie** $\sin 30^\circ$. Ma to znaczenie w zadaniu 6a.

##### 5.2 Czym są sin, cos, tg, ctg

> [!abstract] Najpierw na chłopski rozum: diabelski młyn
> Wyobraź sobie diabelski młyn o promieniu **1 metr**, z osią (środkiem) w punkcie $(0,0)$. Siedzisz w wagoniku $P$. Startujesz **z prawej strony, na wysokości osi** i jedziesz w górę, czyli przeciwnie do wskazówek zegara.
> - **$x$** to droga przejechana po obwodzie, czyli **kąt w radianach**. Pełny obrót to $2\pi \approx 6{,}28$, bo tyle wynosi obwód koła o promieniu 1.
> - **$\sin x$** to Twoja **wysokość** względem osi: nad osią plus, pod osią minus.
> - **$\cos x$** to Twoja odległość **w prawo** od osi: po prawej plus, po lewej minus.
>
> | przejechane $x$ | gdzie jesteś | $\sin x$ (wysokość) | $\cos x$ (w prawo) |
> |---|---|---|---|
> | $0$ | z prawej, na wysokości osi | $0$ | $1$ |
> | $\frac{\pi}{2} \approx 1{,}57$ | **na samej górze** | $1$ | $0$ |
> | $\pi \approx 3{,}14$ | z lewej, na wysokości osi | $0$ | $-1$ |
> | $\frac{3\pi}{2} \approx 4{,}71$ | **na samym dole** | $-1$ | $0$ |
> | $2\pi \approx 6{,}28$ | z powrotem na starcie | $0$ | $1$ |
>
> **Co z tego wynika:**
> - Przez pierwsze pół obrotu (od $0$ do $\pi$) jesteś **nad osią**, więc $\sin$ jest **dodatni**. Przez drugie pół (od $\pi$ do $2\pi$) jesteś **pod osią**, więc $\sin$ jest **ujemny**. Potem kręcisz się od nowa i wszystko się powtarza.
> - $\cos$ jest dodatni, gdy jesteś w **prawej połowie** koła: od $0$ do $\frac{\pi}{2}$ i od $\frac{3\pi}{2}$ do $2\pi$.
> - Wyżej niż $1$ ani niżej niż $-1$ się nie da, bo koło ma promień 1. Dlatego $\sin$ i $\cos$ są zawsze w $[-1, 1]$.
> - $\operatorname{tg} x = \frac{\sin x}{\cos x}$, więc tangensa nie trzeba sobie osobno wyobrażać, wystarczy podzielić.
>
> Poniżej to samo, tylko porządnie, w języku matematyki.

Narysuj okrąg o promieniu 1 ze środkiem w $(0,0)$. Od dodatniej półosi $x$ odmierz kąt $x$ przeciwnie do ruchu wskazówek zegara. Ramię kąta przetnie okrąg w punkcie $(\cos x,\ \sin x)$:
- $\cos x$ to **współrzędna pozioma** tego punktu,
- $\sin x$ to **współrzędna pionowa**,
- $\operatorname{tg} x = \dfrac{\sin x}{\cos x}$, $\quad \operatorname{ctg} x = \dfrac{\cos x}{\sin x}$.

Z tego wynika, że $\sin$ i $\cos$ są zawsze między $-1$ a $1$, bo punkt leży na okręgu o promieniu 1.

> [!question]- A gdyby okrąg miał promień 2 (albo dowolny $r$)?
> Wartości $\sin$ i $\cos$ **się nie zmienią**, bo zależą tylko od kąta, a nie od wielkości okręgu.
> - Ramię kąta $x$ przetnie okrąg o promieniu $r$ w punkcie $(a, b) = (r\cos x,\ r\sin x)$, czyli $r$ razy dalej od środka niż na okręgu jednostkowym. Trójkąty prostokątne pod tymi punktami są **podobne**: wszystkie boki dużego są $r$ razy dłuższe.
> - Ogólnie: $\cos x = \dfrac{a}{r}$, $\quad \sin x = \dfrac{b}{r}$. Przykład: $r = 2$, $x = 30^\circ$, punkt $(\sqrt3,\ 1)$, więc $\sin 30^\circ = \frac12$, tyle samo co przy $r = 1$.
> - Współrzędna punktu na okręgu nie może być dalej od środka niż promień: $|a| \le r$, $|b| \le r$. Po podzieleniu przez $r$ zawsze wychodzi liczba z $[-1, 1]$.
>
> Okrąg o promieniu **1** bierze się tylko dla wygody: wtedy nie trzeba dzielić przez $r$, a współrzędne punktu to od razu $\cos x$ i $\sin x$.

![[AM_Z0_okrag_jednostkowy.svg|560]]

> [!note] Jak czytać rysunek (kąt $x \approx 40^\circ$)
> - **Trójkąt prostokątny** $O$ – $(\cos x, 0)$ – $P$ ma przeciwprostokątną $= 1$ (promień). Dlatego szkolne „przyprostokątna przy kącie / przeciwprostokątna” to po prostu długość **niebieskiego** odcinka, a „przyprostokątna naprzeciw kąta / przeciwprostokątna” to długość **czerwonego**.
> - **$\cos x$** (niebieski): jak daleko w **prawo** (lub w lewo, gdy ujemny) jest punkt $P$.
> - **$\sin x$** (czerwony): jak wysoko (lub nisko, gdy ujemny) jest punkt $P$.
> - **$\operatorname{tg} x$** (zielony): przedłuż ramię kąta do pionowej prostej $x = 1$. Wysokość punktu przecięcia to $\operatorname{tg} x$. Uzasadnienie: duży trójkąt (podstawa $1$, wysokość $\operatorname{tg} x$) jest podobny do małego (podstawa $\cos x$, wysokość $\sin x$), więc $\frac{\operatorname{tg} x}{1} = \frac{\sin x}{\cos x}$.
> - **$\operatorname{ctg} x$** (pomarańczowy): przedłuż ramię do poziomej prostej $y = 1$. Odległość w poziomie punktu przecięcia od osi $y$ to $\operatorname{ctg} x$.

Co widać od razu z rysunku:
- Gdy $x \to \frac{\pi}{2}$, ramię staje się pionowe i **nigdy nie przetnie** prostej $x = 1$. Dlatego $\operatorname{tg}\frac{\pi}{2}$ nie istnieje (to samo co dzielenie przez $\cos\frac{\pi}{2} = 0$).
- Gdy $x \to 0$, ramię staje się poziome i nie przetnie prostej $y = 1$. Dlatego $\operatorname{ctg} 0$ nie istnieje.
- $\operatorname{tg}$ i $\operatorname{ctg}$ mogą być dowolnie duże (zielony odcinek rośnie bez końca, gdy kąt zbliża się do $\frac{\pi}{2}$), a $\sin$ i $\cos$ nie wyjdą poza okrąg.
- $\sin^2 x + \cos^2 x = 1$ to twierdzenie Pitagorasa dla czerwono-niebiesko-czarnego trójkąta.

**Znaki w ćwiartkach.** Punkt $P$ obiega okrąg. Znak $\cos$ to znak współrzędnej $x$ punktu $P$, znak $\sin$ to znak współrzędnej $y$, a $\operatorname{tg}$ i $\operatorname{ctg}$ są dodatnie, gdy oba mają ten sam znak:

![[AM_Z0_znaki_cwiartki.svg|480]]

| Ćwiartka | Kąty | $\sin$ | $\cos$ | $\operatorname{tg}$, $\operatorname{ctg}$ |
|---|---|---|---|---|
| I | $\left(0, \frac{\pi}{2}\right)$ | $+$ | $+$ | $+$ |
| II | $\left(\frac{\pi}{2}, \pi\right)$ | $+$ | $-$ | $-$ |
| III | $\left(\pi, \frac{3\pi}{2}\right)$ | $-$ | $-$ | $+$ |
| IV | $\left(\frac{3\pi}{2}, 2\pi\right)$ | $-$ | $+$ | $-$ |

**Od koła do fali.** Narysuj wysokość wagonika ($\sin x$) w zależności od przejechanej drogi $x$. Wyjdzie **fala**. To samo z odległością w prawo ($\cos x$):

![[AM_Z0_wykres_sin_cos.svg|700]]

Jak czytać:
- **Zielone** obszary to miejsca, gdzie funkcja jest **dodatnia**, a **czerwone** to miejsca, gdzie jest **ujemna**.
- $\sin$: od $0$ do $\pi$ (do $3{,}14$) jest **plus**, od $\pi$ do $2\pi$ (do $6{,}28$) jest **minus**, potem to samo od nowa.
- $\cos$ to **ta sama fala**, tylko przesunięta: startuje z góry ($\cos 0 = 1$, bo wagonik jest z prawej). Plus jest od $0$ do $\frac{\pi}{2}$, minus od $\frac{\pi}{2}$ do $\frac{3\pi}{2}$, potem znowu plus.
- Fala nigdy nie wychodzi ponad przerywane linie $1$ i $-1$.

> [!tip] Na kolokwium: „kiedy $\sin \ge 0$?” albo „kiedy $\cos \ge 0$?”
> Narysuj sobie tę falę, nawet byle jak, i patrz na **zielone garby**:
> - $\sin u \ge 0$ dla $u \in [0, \pi]$ i co $2\pi$ dalej. Zapis: $u \in [2k\pi,\ \pi + 2k\pi]$, $k \in \mathbb{Z}$.
> - $\cos u \ge 0$ dla $u \in [-\frac{\pi}{2}, \frac{\pi}{2}]$ i co $2\pi$ dalej. Zapis: $u \in [-\frac{\pi}{2} + 2k\pi,\ \frac{\pi}{2} + 2k\pi]$, $k \in \mathbb{Z}$.
>
> „$+2k\pi$” znaczy tylko: **ten sam kawałek powtórzony co pełny obrót** ($\approx 6{,}28$) w prawo i w lewo.

##### 5.3 Tabela wartości

| $x$ | $0$ | $\frac{\pi}{6}$ | $\frac{\pi}{4}$ | $\frac{\pi}{3}$ | $\frac{\pi}{2}$ |
|---|---|---|---|---|---|
| $\sin x$ | $0$ | $\frac12$ | $\frac{\sqrt2}{2}$ | $\frac{\sqrt3}{2}$ | $1$ |
| $\cos x$ | $1$ | $\frac{\sqrt3}{2}$ | $\frac{\sqrt2}{2}$ | $\frac12$ | $0$ |
| $\operatorname{tg} x$ | $0$ | $\frac{\sqrt3}{3}$ | $1$ | $\sqrt3$ | nie istnieje |

> [!tip] Sposób na zapamiętanie
> $\sin$ w kolejnych kolumnach to $\frac{\sqrt0}{2}, \frac{\sqrt1}{2}, \frac{\sqrt2}{2}, \frac{\sqrt3}{2}, \frac{\sqrt4}{2}$. $\cos$ to ta sama lista **od tyłu**.

Inne wartości do zapamiętania: $\sin\pi = 0$, $\cos\pi = -1$, $\sin\frac{3\pi}{2} = -1$, $\cos\frac{3\pi}{2} = 0$. Sinus jest **nieparzysty**: $\sin(-x) = -\sin x$, np. $\sin(-\frac{\pi}{6}) = -\frac12$.

##### 5.4 Własności czterech funkcji

| Funkcja | Dziedzina | Zbiór wartości | Okres | Miejsca zerowe |
|---|---|---|---|---|
| $\sin x$ | $\mathbb{R}$ | $[-1, 1]$ | $2\pi$ | $k\pi$ |
| $\cos x$ | $\mathbb{R}$ | $[-1, 1]$ | $2\pi$ | $\frac{\pi}{2} + k\pi$ |
| $\operatorname{tg} x$ | $x \ne \frac{\pi}{2} + k\pi$ | $\mathbb{R}$ | $\pi$ | $k\pi$ |
| $\operatorname{ctg} x$ | $x \ne k\pi$ | $\mathbb{R}$ | $\pi$ | $\frac{\pi}{2} + k\pi$ |

($k \in \mathbb{Z}$, czyli $k$ to dowolna liczba całkowita.) Oznaczenia: $\operatorname{tg} = \tan$, $\operatorname{ctg} = \cot$.

> [!question]- Jak dziedzina sinusa może być $\mathbb{R}$, skoro sinus jest tylko między $-1$ a $1$?
> To dwie różne rzeczy:
> - **Dziedzina** to to, co **wkładasz** do funkcji, czyli **kąt** $x$.
> - **Zbiór wartości** to to, co **wychodzi**, czyli $\sin x$.
>
> Przedział $[-1, 1]$ dotyczy tego, **co wychodzi**.
>
> **Dlaczego kąt może być dowolny.** Na rysunku z [[#5.2 Czym są sin, cos, tg, ctg|5.2]] punkt $P$ obiega okrąg:
> - $x = 2\pi$ to pełny obrót (wracasz do startu), $x = 3\pi$ to półtora obrotu i tak dalej, więc kąt może być dowolnie duży.
> - Kąt **ujemny** oznacza kręcenie w drugą stronę, zgodnie z ruchem wskazówek zegara. Na przykład $x = -\frac{\pi}{2}$ to ćwierć obrotu w dół.
>
> Dla każdego kąta ramię gdzieś przetnie okrąg, więc $\sin x$ i $\cos x$ zawsze istnieją. Stąd dziedzina $\mathbb{R}$. Punkt przecięcia jest jednak zawsze **na okręgu**, więc jego współrzędne nie wyjdą poza $[-1, 1]$.
>
> Przykład: $\sin 100 \approx -0{,}51$. Kąt $100$ rad to prawie 16 obrotów, a wynik i tak jest między $-1$ a $1$.
>
> | | $\sin$ | $\operatorname{tg}$ |
> |---|---|---|
> | co wkładasz (dziedzina) | każdy kąt: $\mathbb{R}$ | każdy kąt oprócz $\frac{\pi}{2} + k\pi$ |
> | co wychodzi (zbiór wartości) | tylko $[-1, 1]$ | każda liczba: $\mathbb{R}$ |
>
> Przy $\operatorname{tg}$ jest odwrotnie: niektórych kątów nie można włożyć, ale wynik może być dowolnie duży. To zielony odcinek na prostej $x = 1$ z rysunku w 5.2.

- Dziedzina $\operatorname{tg}$: to ułamek z $\cos x$ w mianowniku, a $\cos x = 0$ dla $x = \frac{\pi}{2} + k\pi$. W tych miejscach wykres ma pionowe asymptoty (linie, do których się zbliża, ale ich nie dotyka).
- Dziedzina $\operatorname{ctg}$: w mianowniku jest $\sin x$, który jest zerem dla $x = k\pi$.
- **Okresowość:** wykres powtarza się co okres, np. $\sin(x + 2\pi) = \sin x$. Dlatego równania trygonometryczne mają **nieskończenie wiele** rozwiązań, stąd „$+2k\pi$” w odpowiedziach.

##### 5.5 Równanie sin x = a

(Dla $-1 \le a \le 1$. Dla innych $a$ nie ma rozwiązań.) Na jednym okresie sinus przyjmuje każdą wartość z $(-1, 1)$ **dwa razy**. Jeśli $x_0$ jest jednym rozwiązaniem, to drugim jest $\pi - x_0$. Wszystkie rozwiązania:
$$x = x_0 + 2k\pi \qquad\lor\qquad x = \pi - x_0 + 2k\pi$$
Jak znaleźć $x_0$, gdy $a$ nie jest „ładną” liczbą z tabeli? Do tego służy $\arcsin$ z następnego rozdziału: $x_0 = \arcsin a$.

---

#### 6. Funkcje cyklometryczne (arcusy)

**Idea:** sinus zamienia kąt na liczbę ($\sin\frac{\pi}{6} = \frac12$). Arcus sinus robi to **odwrotnie**: zamienia liczbę na kąt ($\arcsin\frac12 = \frac{\pi}{6}$). Pytanie brzmi: *„jaki kąt ma sinus równy $\frac12$?”*

**Problem:** takich kątów jest nieskończenie wiele ($\frac{\pi}{6}$, $\frac{5\pi}{6}$, $\frac{\pi}{6} + 2\pi$, …), a funkcja musi dać **jedną** odpowiedź.
**Rozwiązanie:** umawiamy się, że odpowiedź bierzemy z ustalonego przedziału.

| Funkcja | Pytanie | Dziedzina | Odpowiedź z przedziału | Monotoniczność |
|---|---|---|---|---|
| $\arcsin a$ | jaki kąt ma sinus $= a$? | $[-1, 1]$ | $[-\frac{\pi}{2}, \frac{\pi}{2}]$ | rosnąca |
| $\arccos a$ | jaki kąt ma cosinus $= a$? | $[-1, 1]$ | $[0, \pi]$ | malejąca |
| $\operatorname{arctg} a$ | jaki kąt ma tangens $= a$? | $\mathbb{R}$ | $(-\frac{\pi}{2}, \frac{\pi}{2})$ | rosnąca |
| $\operatorname{arcctg} a$ | jaki kąt ma cotangens $= a$? | $\mathbb{R}$ | $(0, \pi)$ | malejąca |

Dziedzina $\arcsin$ i $\arccos$ to $[-1, 1]$, bo sinus i cosinus przyjmują tylko takie wartości. Pytanie „jaki kąt ma sinus równy 5?” nie ma odpowiedzi.

> [!note] Nawiasy przy arctg i arcctg
> Przedziały dla $\operatorname{arctg}$ i $\operatorname{arcctg}$ są **otwarte**: wartości $\pm\frac{\pi}{2}$ (odpowiednio $0$ i $\pi$) to asymptoty, których funkcja nigdy nie osiąga. Na 2. stronie kartki Z00 są nawiasy kwadratowe, to nieścisłość. Na 3. stronie i w rozwiązaniach jest poprawnie.

> [!important] Jak liczyć $\arcsin a$ (2 kroki)
> 1. Znajdź w tabeli z rozdz. 5.3 kąt, którego sinus wynosi $a$.
> 2. Sprawdź, czy ten kąt leży w $[-\frac{\pi}{2}, \frac{\pi}{2}]$. Jeśli tak, to jest odpowiedź.
>
> Przykład: $\arcsin\frac{\sqrt3}{2} = \frac{\pi}{3}$, bo $\sin\frac{\pi}{3} = \frac{\sqrt3}{2}$ i $\frac{\pi}{3} \in [-\frac{\pi}{2}, \frac{\pi}{2}]$.
> Dla liczb ujemnych: $\arcsin(-a) = -\arcsin a$, np. $\arcsin(-\frac12) = -\frac{\pi}{6}$.
> Dla $\arccos$ tak samo, tylko przedział to $[0, \pi]$.

> [!warning] Pułapka: $\arcsin(\sin x) \ne x$ (w ogólności)
> - $\sin(\arcsin x) = x$ **zawsze** (dla $x \in [-1, 1]$): pytasz o kąt o sinusie $x$, a potem liczysz jego sinus, więc wraca $x$.
> - $\arcsin(\sin x) = x$ **tylko** gdy $x \in [-\frac{\pi}{2}, \frac{\pi}{2}]$.
>
> Przykład: $\arcsin(\sin\pi) = \arcsin 0 = 0 \ne \pi$.
> Zasada: **najpierw policz to, co jest w środku**, potem arcus.

> [!example] Równanie $\sin(2x) = 0{,}56$ (wzór z rozdz. 5.5)
> Podstaw $u = 2x$: $u = \arcsin 0{,}56 + 2k\pi$ lub $u = \pi - \arcsin 0{,}56 + 2k\pi$.
> Podziel przez 2: $x = \frac12\arcsin 0{,}56 + k\pi$ lub $x = \frac{\pi}{2} - \frac12\arcsin 0{,}56 + k\pi$.

> [!example] Nierówność z arcusem (zastosowanie rozdz. 4.1)
> $\operatorname{arctg}(2x) < \frac{\pi}{4}$. $\operatorname{arctg}$ jest rosnący, więc nakładamy na obie strony $\operatorname{tg}$ bez zmiany znaku: $2x < \operatorname{tg}\frac{\pi}{4} = 1$, czyli $x < \frac12$.

> [!success] ➡️ Teraz zrób
> [[#Zadanie 4 – wartości arcusów|Zadania 4, 5 i 6*]]. Potem wróć i czytaj rozdział 7.

---

#### 7. Czym jest funkcja?

Do tej pory poznałeś konkretne funkcje. Teraz ogólnie.

**Funkcja** $f: X \to Y$ to reguła, która **każdemu** elementowi $x$ ze zbioru $X$ przyporządkowuje **dokładnie jeden** element $y = f(x)$ ze zbioru $Y$.

- $x$ to **argument** (zmienna), $y = f(x)$ to **wartość**.
- $D_f$ to **dziedzina**: wszystkie $x$, które wolno wstawić.
- $W_f$ to **zbiór wartości**: wszystkie $y$, które faktycznie wychodzą.

> [!example] Analogia
> Funkcja to automat z napojami: wrzucasz numer ($x$) i dostajesz **jeden** konkretny napój ($y$). Dziedzina to numery, które automat przyjmuje. Zbiór wartości to napoje, które naprawdę może wydać.

**Wykres** to zbiór punktów $(x, f(x))$ na płaszczyźnie.

> [!important] Test prostej pionowej
> Krzywa jest wykresem funkcji ⇔ każda prosta pionowa przecina ją **co najwyżej raz**. Dwa przecięcia oznaczają, że jeden $x$ ma dwie wartości, a funkcja na to nie pozwala.

Na wykresie:
- **dziedzina** to „cień” wykresu rzucony na oś poziomą,
- **zbiór wartości** to „cień” rzucony na oś pionową.

> [!note] Nazwy zmiennych nie mają znaczenia
> $f(x) = x^2$, $f(t) = t^2$ i $f(\alpha) = \alpha^2$ to **ta sama funkcja**, tylko osie są inaczej podpisane. W zadaniu 8 podpisz osie tak, jak w treści: przy $g(s) = t = \sqrt{s}$ oś pozioma to $s$, a pionowa to $t$.

**Ważne przykłady z wykładu:**

| Funkcja | Dziedzina | Zbiór wartości | Dlaczego |
|---|---|---|---|
| $y = x^2$ | $\mathbb{R}$ | $[0, \infty)$ | kwadrat jest $\ge 0$ |
| $y = 1/x$ | $\mathbb{R}\setminus\{0\}$ | $\mathbb{R}\setminus\{0\}$ | nie dzielimy przez 0 |
| $y = \sqrt{x}$ | $[0, \infty)$ | $[0, \infty)$ | pierwiastek z liczby $\ge 0$ |
| $y = \sqrt{4-x}$ | $(-\infty, 4]$ | $[0, \infty)$ | $4 - x \ge 0 \Leftrightarrow x \le 4$ |
| $y = \sqrt{1-x^2}$ | $[-1, 1]$ | $[0, 1]$ | $1 - x^2 \ge 0$; największa wartość to 1 (dla $x=0$) |

**Funkcje elementarne:** wszystko, co da się zbudować z funkcji poznanych w rozdziałach 1–6 (potęgi, wykładnicze, logarytmy, trygonometryczne, arcusy) za pomocą $+,\ -,\ \cdot,\ :$ i składania (rozdz. 9), np. $5^{\sqrt{\cos x + 3x^8}}$.

---

#### 8. Dziedzina naturalna – lista kontrolna

**Dziedzina naturalna** to największy zbiór $x$, dla których wzór „ma sens”. Każda funkcja z rozdziałów 1–6 ma swój warunek. Zebrane razem:

| We wzorze widzisz… | Warunek | Skąd (rozdział) |
|---|---|---|
| ułamek $\dfrac{\dots}{M}$ | $M \ne 0$ | nie dzielimy przez 0 |
| pierwiastek **parzystego** stopnia $\sqrt{A}$, $\sqrt[4]{A}$ | $A \ge 0$ | kwadrat nie jest ujemny |
| pierwiastek **nieparzystego** stopnia $\sqrt[3]{A}$ | brak warunku | $\sqrt[3]{-8} = -2$ |
| logarytm $\log_a A$ | $A > 0$ | 2 |
| $\operatorname{tg} A$ | $A \ne \frac{\pi}{2} + k\pi$ | 5.4 |
| $\operatorname{ctg} A$ | $A \ne k\pi$ | 5.4 |
| $\arcsin A$, $\arccos A$ | $-1 \le A \le 1$ | 6 |
| $a^A$, $\sin A$, $\cos A$, $\operatorname{arctg} A$, wielomian | brak warunku | |

> [!tip] Procedura
> 1. Wypisz **wszystkie** warunki (każdy ułamek, pierwiastek, logarytm…).
> 2. Rozwiąż każdy osobno (to zwykłe równania i nierówności z rozdz. 3–4).
> 3. Weź **część wspólną** ($\cap$), bo wszystkie warunki muszą zachodzić jednocześnie.

> [!example] Przykład: $f(x) = \log_2(\log_3 x)$
> - wewnętrzny log: $x > 0$
> - zewnętrzny log: $\log_3 x > 0 \Leftrightarrow \log_3 x > \log_3 1 \Leftrightarrow x > 1$ (bo $\log_3$ jest rosnący)
> - część wspólna: $D_f = (1, \infty)$

> [!tip] Zbiór wartości
> Zastanów się, jakie wartości przyjmuje „środek”, a potem co z nimi robi funkcja zewnętrzna. Przykład: $\sqrt{x}$ daje wszystko z $[0, \infty)$.

> [!success] ➡️ Teraz zrób
> [[#Zadanie 7 – dziedzina naturalna i zbiór wartości|Zadania 7 i 8]]. Potem wróć i czytaj rozdział 9.

---

#### 9. Złożenie funkcji

$$(f \circ g)(x) = f(g(x))$$

Czytaj od środka: **najpierw** $g$, a jej wynik wkładasz do $f$.

- $g$ to funkcja **wewnętrzna** (działa pierwsza),
- $f$ to funkcja **zewnętrzna** (działa ostatnia).

> [!example] Przykład z wykładu
> $g(x) = 1 + \sqrt{x}$, $f(x) = 3x + 1$.
> $$f(g(x)) = 3\cdot g(x) + 1 = 3(1+\sqrt{x}) + 1 = 3\sqrt{x} + 4$$
> Technika: w miejsce **każdego** $x$ we wzorze na $f$ wstaw cały wzór na $g(x)$ w nawiasie.
>
> Kolejność ma znaczenie: $g(f(x)) = 1 + \sqrt{3x+1}$, a to zupełnie inna funkcja.
>
> (W PDF wykładu w drugiej linii jest literówka „$f\circ g: R \to \dots$”. Poprawna dziedzina to $[0, +\infty)$, bo $\sqrt{x}$ wymaga $x \ge 0$.)

**Rozkładanie złożenia na części** (zadanie 9). Zadaj pytanie: *co liczyłbym na kalkulatorze jako ostatnie?* To jest funkcja zewnętrzna. Potem schodzisz do środka.

> [!example] $\sin^4(\log_2(x+2))$
> Kalkulator: (1) $x+2$, (2) $\log_2$ z tego, (3) $\sin$ z tego, (4) do potęgi 4.
> Od zewnątrz: $t^4$, gdzie $t = \sin s$, gdzie $s = \log_2 p$, gdzie $p = x + 2$.
> Uwaga: $\sin^4(\dots)$ oznacza $\big(\sin(\dots)\big)^4$.

**Dziedzina złożenia $f(g(x))$:**
1. $x$ musi należeć do dziedziny $g$,
2. **wynik** $g(x)$ musi należeć do dziedziny $f$.

Najprościej: napisz gotowy wzór na złożenie i zastosuj listę kontrolną z rozdziału 8. Pamiętaj o warunkach z funkcji wewnętrznej, nawet jeśli „znikną” po uproszczeniu wzoru.

> [!success] ➡️ Teraz zrób
> [[#Zadanie 9 – rozkład złożenia|Zadania 9 i 10]]. Potem wróć i czytaj rozdział 10.

---

#### 10. Funkcja odwrotna

$f^{-1}$ „cofa” działanie $f$: jeśli $f(x) = y$, to $f^{-1}(y) = x$. Sprawdzian (z rozdz. 9 o złożeniu):
$$f(f^{-1}(x)) = x \quad\text{oraz}\quad f^{-1}(f(x)) = x$$

- Funkcja odwrotna istnieje tylko dla funkcji **różnowartościowej** (różne $x$ dają różne $y$). Dla $x^2$ nie istnieje, bo $2^2 = (-2)^2$. Z tego samego powodu arcusy w rozdz. 6 odwracają tylko kawałek sinusa.
- Wykres $f^{-1}$ to odbicie wykresu $f$ względem prostej $y = x$.
- Dziedzina i zbiór wartości **zamieniają się miejscami**.

> [!tip] Jak wyznaczyć $f^{-1}$ (3 kroki)
> 1. Napisz $y = f(x)$.
> 2. Wylicz $x$ w zależności od $y$.
> 3. Zamień nazwy: $x \leftrightarrow y$.
>
> Przykład: $y = 2x - 1 \Rightarrow x = \frac{y+1}{2} \Rightarrow f^{-1}(x) = \frac{x+1}{2}$.

Pary funkcji wzajemnie odwrotnych, które już znasz:

| $f$ | $f^{-1}$ |
|---|---|
| $a^x$ | $\log_a x$ |
| $x^3$ | $\sqrt[3]{x}$ |
| $x^2$ dla $x \ge 0$ | $\sqrt{x}$ |
| $\sin x$ na $[-\frac{\pi}{2}, \frac{\pi}{2}]$ | $\arcsin x$ |
| $\cos x$ na $[0, \pi]$ | $\arccos x$ |
| $\operatorname{tg} x$ na $(-\frac{\pi}{2}, \frac{\pi}{2})$ | $\operatorname{arctg} x$ |

> [!success] ➡️ Teraz zrób
> [[#Zadanie 11* – czy funkcje są wzajemnie odwrotne?|Zadanie 11*]]. Na koniec [[#Ściąga – najważniejsze wzory i zasady|ściąga]] i [[#Most do analizy – po co mi to?|test gotowości]].

---

## Ćwiczenia

### Z00 – Zadania powtórzeniowe: rozwiązania krok po kroku

Treść: [[Z00 powtorzenie funkcje.pdf]] · Oficjalne rozwiązania wybranych zadań: [[Z00 powtorzenie funkcje_Rozwiazania.pdf]]

> [!info] Zasada
> Najpierw rozwiąż sam, potem kliknij, żeby rozwinąć rozwiązanie. Zadania z gwiazdką (*) to „dla ambitnych” (na niebiesko w PDF).

#### Zadanie 1 – wartości logarytmów i potęg
Teoria: [[#1. Potęgi i funkcja wykładnicza]], [[#2. Logarytmy]]

> [!success]- a)–d)
> a) $\log_4 16 = 2$, bo $4^2 = 16$
> b) $\log_4 \frac14 = -1$, bo $4^{-1} = \frac14$
> c) $\log_4 2 = \frac12$, bo $4^{1/2} = \sqrt4 = 2$
> d) $\log_4 4^{\sin x} = \sin x$, bo $\log_a(a^x) = x$

> [!success]- e)–i)
> e) $5^{\log_5 77} = 77$, bo $a^{\log_a x} = x$
> f) $3^{\log_3(x^4+6)} = x^4 + 6$ (ten sam wzór; $x^4 + 6 > 0$ zawsze, więc log istnieje)
> g) $2^{3\log_2 7} = 2^{\log_2 7^3} = 7^3 = 343$ (prawo $r\log_a x = \log_a x^r$)
> h) $5^{x+\log_5 2} = 5^x\cdot 5^{\log_5 2} = 2\cdot 5^x$ (prawo $a^{p+q} = a^p a^q$)
> i) $7^{-\log_7 x} = \frac{1}{7^{\log_7 x}} = \frac1x$, dla $x > 0$

> [!success]- j)–l)
> j) $\frac{3^{2x}}{3} = \frac{3^{2x}}{3^1} = 3^{2x-1}$
> k) $(9^7)^x = 9^{7x}$ $\big(= (9^x)^7 = 3^{14x}\big)$
> l) $\log_4 5 > 1$, bo $5 > 4$ (a $\log_4 4 = 1$ i log rośnie). Ze wzoru 4': $\log_5 4 = \frac{1}{\log_4 5} < 1$.
> Zatem $\log_5 4 < 1 < \log_4 5$, czyli **większa jest $\log_4 5$**.

#### Zadanie 2 – równania
Teoria: [[#3. Wielomiany i równania]]

> [!success]- a) $2^x(x^2+6x+8) = 0$
> Iloczyn $= 0 \Leftrightarrow$ któryś czynnik $= 0$. Ale $2^x > 0$ zawsze, więc zostaje $x^2 + 6x + 8 = 0$.
> $\Delta = 36 - 32 = 4$, $\sqrt\Delta = 2$, $x = \frac{-6 \pm 2}{2}$ → **$x = -2$ lub $x = -4$**.

> [!success]- b) $\sqrt[8]{t} = 1$
> Warunek: $t \ge 0$ (pierwiastek parzystego stopnia). Podnosimy obie strony do potęgi 8: $t = 1^8 = 1$.
> **$t = 1$**

> [!success]- c) $\frac{z^2 - 16}{z^4} = 0$
> Ułamek $= 0$, gdy **licznik** $= 0$, a mianownik $\ne 0$ (rozdz. 3.3). Tak samo jak w d), sprawdzamy to osobno.
>
> **Krok 1 – mianownik** (kiedy jest zerem?): $z^4 = 0 \Rightarrow z = 0$.
> Więc $z = 0$ jest **zakazane** (dzielenie przez zero). Zapisujemy warunek: $z \ne 0$.
>
> **Krok 2 – licznik** (kiedy jest zerem?): $z^2 - 16 = 0 \Rightarrow z^2 = 16 \Rightarrow z = 4$ lub $z = -4$.
> Pamiętaj o obu: $4^2 = 16$ i $(-4)^2 = 16$.
> (Można też ze wzoru $a^2 - b^2 = (a-b)(a+b)$: $\ z^2 - 16 = (z-4)(z+4) = 0$.)
>
> **Krok 3 – porównaj z warunkiem:** czy któreś z rozwiązań to zakazane $z = 0$? Nie, więc oba zostają.
>
> **$z = 4$ lub $z = -4$**
>
> Sprawdzenie dla $z = 4$: $\frac{16 - 16}{256} = \frac{0}{256} = 0$ ✓ (dla $z = -4$ tak samo).

> [!success]- d) $\frac{4x - 6}{2x^2 - x + 4} = 0$
> Ułamek $= 0$, gdy **licznik** $= 0$, a mianownik $\ne 0$ (rozdz. 3.3). Sprawdzamy to osobno.
>
> **Krok 1 – mianownik** (czy gdzieś jest zerem?): $2x^2 - x + 4 = 0$. $\ \Delta = (-1)^2 - 4\cdot2\cdot4 = 1 - 32 = -31 < 0$.
> To równanie nie ma rozwiązań, czyli mianownik **nigdy nie jest zerem**. To dobra wiadomość: nie trzeba wyrzucać żadnego $x$.
>
> **Krok 2 – licznik** (tu jest właściwe rozwiązanie): $4x - 6 = 0 \Rightarrow x = \frac32$.
>
> **$x = \frac32$**
>
> > [!warning] Uwaga
> > $\Delta < 0$ dotyczy tylko **mianownika**, a nie całego zadania. „Brak rozwiązań” oznacza tu, że mianownik nigdy nie jest zerem. Całe równanie ma rozwiązanie z licznika.

#### Zadanie 3 – nierówności
Teoria: [[#4. Nierówności]]

> [!success]- a) $(x-2)(3x+2)(x^2+10) > 0$
> $x^2 + 10 > 0$ zawsze, więc nie wpływa na znak i można go pominąć: $(x-2)(3x+2) > 0$.
> Miejsca zerowe: $2$ i $-\frac23$. Parabola ramionami w górę (przy $x^2$ stoi $3 > 0$), dodatnia na zewnątrz miejsc zerowych.
> **$x \in (-\infty, -\frac23) \cup (2, \infty)$**

> [!success]- b) $y^3 + 4y^2 + 4y \le 0$
> Wyłącz $y$: $y(y^2 + 4y + 4) = y(y+2)^2 \le 0$.
> Miejsca zerowe: $0$ (zwykły czynnik, wężyk przecina oś) i $-2$ (czynnik do kwadratu, wężyk się odbija).
> ```
> znak:    −      −      +
>      ────────●──────●────────► y
>             -2      0
> ```
> **$y \in (-\infty, 0]$** (punkt $-2$ też należy, bo tam wyrażenie $= 0$).

> [!success]- c) $2^x(x^2 - 6x + 8) \ge 0$
> $2^x > 0$, więc wystarczy $x^2 - 6x + 8 \ge 0 \Leftrightarrow (x-2)(x-4) \ge 0$.
> **$x \in (-\infty, 2] \cup [4, \infty)$**

> [!success]- d) $(x+1)(x^2-4) \le 0$
> $(x+1)(x-2)(x+2) \le 0$. Miejsca zerowe $-2, -1, 2$. Rozpisane w [[#4.2 Nierówności wielomianowe – metoda wężyka|rozdziale 4.2]].
> **$x \in (-\infty, -2] \cup [-1, 2]$**

> [!success]- e) $(a+2)^2(1-3a)^2 \le 0$
> Iloczyn dwóch kwadratów jest zawsze $\ge 0$. Może być „$\le 0$” tylko wtedy, gdy jest **równy 0**.
> $a + 2 = 0$ lub $1 - 3a = 0$ → **$a \in \{-2,\ \frac13\}$**

> [!success]- f) $x^9 - 1 < 0$
> $x^9 < 1 = 1^9$. Funkcja $x^9$ (potęga nieparzysta) jest ściśle rosnąca, więc możemy ją „zdjąć”: $x < 1$.
> **$x \in (-\infty, 1)$**

> [!success]- g) $\frac{x-3}{x+5} < 0$
> Warunek: $x \ne -5$. Ułamek ma ten sam znak co iloczyn: $(x-3)(x+5) < 0$.
> Parabola ramionami w górę, ujemna **między** miejscami zerowymi.
> **$x \in (-5, 3)$**

> [!success]- h) $\log_5(5-3x) > 1$
> Rozpisane w [[#4.4 Nierówności z logarytmem|rozdziale 4.4]]. Warunek: $x < \frac53$. $\log_5(5-3x) > \log_5 5$, a $\log_5$ jest rosnący, więc $5 - 3x > 5$.
> **$x \in (-\infty, 0)$**

#### Zadanie 4 – wartości arcusów
Teoria: [[#5. Trygonometria]], [[#6. Funkcje cyklometryczne (arcusy)]]

> [!success]- a)
> - $\arccos\frac12 = \frac{\pi}{3}$, bo $\cos\frac{\pi}{3} = \frac12$ i $\frac{\pi}{3} \in [0, \pi]$
> - $\arcsin\frac{\sqrt3}{2} = \frac{\pi}{3}$, bo $\sin\frac{\pi}{3} = \frac{\sqrt3}{2}$ i $\frac{\pi}{3} \in [-\frac{\pi}{2}, \frac{\pi}{2}]$
> - $\operatorname{arctg} 1 = \frac{\pi}{4}$, bo $\operatorname{tg}\frac{\pi}{4} = 1$
> - $\arcsin(-\frac12) = -\frac{\pi}{6}$, bo $\sin(-\frac{\pi}{6}) = -\frac12$ i $-\frac{\pi}{6} \in [-\frac{\pi}{2}, \frac{\pi}{2}]$

> [!success]- b) $\arccos(1{,}4)$
> **Nie istnieje**: $1{,}4 \notin [-1, 1]$. Cosinus nigdy nie wynosi 1,4.

> [!success]- c)–f)
> c) $\arcsin(\sin\pi) = \arcsin 0 = 0$ (**nie** $\pi$, bo $\pi \notin [-\frac{\pi}{2}, \frac{\pi}{2}]$)
> d) $\sin(\arcsin\frac12) = \frac12$ (wzór $\sin(\arcsin x) = x$ działa zawsze)
> e) $\arcsin(\sin\frac{3\pi}{2}) = \arcsin(-1) = -\frac{\pi}{2}$ (**nie** $\frac{3\pi}{2}$)
> f) $\sin(\arcsin(-1)) = -1$

#### Zadanie 5 – wyznacz x
Teoria: [[#5.5 Równanie sin x = a]], [[#6. Funkcje cyklometryczne (arcusy)]]

> [!success]- a) $\arcsin(\sin x) = \frac{\pi}{2}$
> $\arcsin u = \frac{\pi}{2} \Leftrightarrow u = 1$. Więc $\sin x = 1$.
> **$x = \frac{\pi}{2} + 2k\pi$, $k \in \mathbb{Z}$**

> [!success]- b) $\sin(\arcsin x) = -1$
> Dla $x \in [-1, 1]$ mamy $\sin(\arcsin x) = x$, więc **$x = -1$**.

> [!success]- c) $\sin(2x) = 0{,}56$
> Rozpisane w przykładzie w [[#6. Funkcje cyklometryczne (arcusy)|rozdziale 6]]:
> **$x = \frac12\arcsin 0{,}56 + k\pi$ lub $x = \frac{\pi}{2} - \frac12\arcsin 0{,}56 + k\pi$**, $k \in \mathbb{Z}$
> (numerycznie $\arcsin 0{,}56 \approx 0{,}594$, więc $x \approx 0{,}297 + k\pi$ lub $x \approx 1{,}274 + k\pi$)

#### Zadanie 6* – nierówności z arcusami
Teoria: [[#4.1 Funkcje rosnące i malejące (monotoniczność)]], [[#6. Funkcje cyklometryczne (arcusy)]]

> [!success]- a) $\arcsin x > \frac12$
> $\arcsin$ jest rosnący, więc nakładamy na obie strony $\sin$ bez zmiany znaku: $x > \sin\frac12$.
> **Uwaga:** $\frac12$ to radiany, a nie $30^\circ$, więc $\sin\frac12 \approx 0{,}479$, a nie $\frac12$.
> Jeszcze dziedzina: $x \le 1$.
> **$x \in (\sin\frac12,\ 1]$**

> [!success]- b) $\operatorname{arctg}(2x) < \frac{\pi}{4}$
> $\operatorname{arctg}$ jest rosnący na $\mathbb{R}$, więc nakładamy $\operatorname{tg}$: $2x < \operatorname{tg}\frac{\pi}{4} = 1$.
> **$x < \frac12$**

> [!success]- c) $\arccos x > 4$
> $\arccos x \in [0, \pi]$, a $\pi \approx 3{,}14 < 4$. Arccos nigdy nie przekracza 4.
> **Brak rozwiązań** ($x \in \emptyset$)

#### Zadanie 7 – dziedzina naturalna i zbiór wartości
Teoria: [[#8. Dziedzina naturalna – lista kontrolna]]

> [!success]- a) $f(x) = \sqrt x$
> $D_f = [0, \infty)$, $W_f = [0, \infty)$

> [!success]- b) $f(t) = \frac{1}{2t^2 + 4t + 5}$
> Warunek: $2t^2 + 4t + 5 \ne 0$. $\Delta = 16 - 40 = -24 < 0$, więc mianownik nigdy nie jest zerem.
> $D_f = \mathbb{R}$

> [!success]- c) $f(x) = \log_{10}(x^2 - 1)$
> Warunek: $x^2 - 1 > 0 \Leftrightarrow (x-1)(x+1) > 0 \Leftrightarrow x < -1 \lor x > 1$.
> $D_f = (-\infty, -1) \cup (1, \infty)$
> Zbiór wartości: wyrażenie $x^2 - 1$ przyjmuje **wszystkie** wartości z $(0, \infty)$, a $\log_{10}$ zamienia $(0, \infty)$ na całe $\mathbb{R}$. Więc $W_f = \mathbb{R}$.
>
> > [!question]- Dlaczego $\log_{10}$ zamienia $(0, \infty)$ na całe $\mathbb{R}$?
> > Oznaczmy przez $t = x^2 - 1$ to, co **wchodzi do logarytmu**. Uwaga: $t$ to nie $x$! $x$ jest z dziedziny $f$, a $t$ jest z $(0,\infty)$.
> >
> > $\log_{10} t = y \iff 10^y = t$. Dla **dowolnego** $y \in \mathbb{R}$ bierzesz $t = 10^y$. Ta liczba jest zawsze dodatnia i $\log_{10}(10^y) = y$. Każda liczba rzeczywista jest więc wynikiem logarytmu.
> >
> > | $t$ | $1000$ | $10$ | $1$ | $0{,}1$ | $0{,}001$ |
> > |---|---|---|---|---|---|
> > | $\log_{10} t$ | $3$ | $1$ | $0$ | $-1$ | $-3$ |
> >
> > - $t \to \infty$: $\log t$ rośnie bez ograniczeń (wolno, ale bez końca).
> > - $t \to 0^+$: $\log t$ spada do $-\infty$.
> >
> > **Przykład w zadaniu:** jakie $x$ daje $f(x) = -3$? Potrzebne jest $t = x^2 - 1 = 0{,}001$, czyli $x^2 = 1{,}001$, a więc $x = \pm\sqrt{1{,}001} \approx \pm 1{,}0005$. To leży w dziedzinie, bo $1{,}0005 > 1$. Gdy $x$ jest tuż obok $\pm1$, $t$ jest tuż nad zerem, a logarytm daje dużą liczbę ujemną.
> > - Logarytm jest ciągły i rosnący, więc po drodze trafia w każdą liczbę pomiędzy.
> >
> > Na wykresach: $\log_{10} x$ to odbicie $10^x$ względem $y = x$ ([[#2. Logarytmy|rozdz. 2]]). Funkcja $10^x$ ma $D = \mathbb{R}$, $W = (0,\infty)$. Odbicie zamienia te zbiory miejscami, więc logarytm ma $D = (0,\infty)$, $W = \mathbb{R}$.
> >
> > **Dlaczego środek ma znaczenie:** dla $x > 1$ wyrażenie $x^2 - 1$ rośnie w sposób ciągły od $0$ do $\infty$, więc daje **całe** $(0,\infty)$. Dla porównania $\log_{10}(x^2+1)$: środek przyjmuje tylko wartości z $[1,\infty)$, więc $W = [0,\infty)$ (bo $\log 1 = 0$).

> [!success]- d) $f(x) = \log_2(\log_3 x)$
> Rozpisane w [[#8. Dziedzina naturalna – lista kontrolna|rozdziale 8]]: $D_f = (1, \infty)$

> [!success]- e) $f(y) = 3^{y^2 + y + 1}$
> Dziedzina: $\mathbb{R}$ (wykładnicza i wielomian nie mają ograniczeń).
> Zbiór wartości. Krok 1: jakie wartości ma wykładnik $w = y^2 + y + 1$? Parabola ramionami w górę, wierzchołek w $y_w = -\frac{b}{2a} = -\frac12$, wartość najmniejsza $\frac14 - \frac12 + 1 = \frac34$. Więc $w \in [\frac34, \infty)$.
> Krok 2: $3^w$ jest rosnąca, więc najmniejsza wartość to $3^{3/4}$ i dalej rośnie do nieskończoności.
> $W_f = [3^{3/4}, \infty) \approx [2{,}28,\ \infty)$
>
> > [!question]- Wytłumacz łopatologicznie
> > **Uwaga na literki:** tutaj argument nazywa się $y$, a nie $x$. To tylko nazwa. $f(y)$ czytasz jak $f(x)$: „wkładam liczbę $y$, dostaję wynik”.
> >
> > **Jak czytać wzór:** funkcja robi dwie rzeczy po kolei.
> > 1. Liczy **wykładnik** $w = y^2 + y + 1$ (zwykła liczba).
> > 2. Podnosi $3$ do tej potęgi: $3^w$.
> >
> > ---
> >
> > **Dziedzina: czy coś może się zepsuć?** Przejdź przez [[#8. Dziedzina naturalna – lista kontrolna|listę kontrolną]]:
> > - ułamek? nie ma, więc nie dzielimy przez 0;
> > - pierwiastek? nie ma;
> > - logarytm? nie ma;
> > - $y^2 + y + 1$ to wielomian, więc da się go policzyć dla każdej liczby;
> > - $3^{\text{cokolwiek}}$ też da się zawsze policzyć (np. $3^{-2} = \frac19$, $3^{0{,}5} = \sqrt3$).
> >
> > Nic się nie psuje, więc $D_f = \mathbb{R}$.
> >
> > ---
> >
> > **Zbiór wartości: idziemy od środka.**
> >
> > **Krok 1. Jakie liczby może dać wykładnik $w = y^2 + y + 1$?** Najpierw zrób tabelkę:
> >
> > | $y$ | $-2$ | $-1$ | $-\frac12$ | $0$ | $1$ | $2$ |
> > |---|---|---|---|---|---|---|
> > | $w = y^2 + y + 1$ | $3$ | $1$ | $\frac34$ | $1$ | $3$ | $7$ |
> >
> > Widać, że wartości spadają, dochodzą do $\frac34$ przy $y = -\frac12$ i znowu rosną. To jest parabola z ramionami w górę (bo przy $y^2$ stoi $+1$), a $\frac34$ to jej **dołek** (wierzchołek).
> >
> > Skąd pewność, że niżej niż $\frac34$ się nie da? Przepisz wzór sprytniej (postać kanoniczna):
> > $$y^2 + y + 1 = \left(y + \tfrac12\right)^2 + \tfrac34$$
> > (sprawdzenie: $(y+\frac12)^2 = y^2 + y + \frac14$, a $\frac14 + \frac34 = 1$ ✓).
> > Kwadrat nigdy nie jest ujemny, więc $(y+\frac12)^2 \ge 0$. Zatem $w \ge 0 + \frac34 = \frac34$. Równość jest tylko dla $y = -\frac12$.
> >
> > W górę nie ma limitu: weź $y = 100$, a $w = 10101$. Ramiona paraboli idą do nieskończoności.
> > **Wniosek:** $w \in [\frac34, \infty)$.
> >
> > **Krok 2. Co robi z tym $3^w$?** Funkcja $3^w$ jest **rosnąca**: większy wykładnik daje większy wynik ($3^1 = 3$, $3^2 = 9$, $3^3 = 27$). Więc:
> > - **najmniejszy** wykładnik $\frac34$ daje **najmniejszy** wynik: $3^{3/4} = \sqrt[4]{3^3} = \sqrt[4]{27} \approx 2{,}28$;
> > - coraz większy wykładnik daje coraz większy wynik, bez końca.
> >
> > **Wniosek:** $W_f = [3^{3/4}, \infty)$. Nawias przy $3^{3/4}$ jest **kwadratowy**, bo ta wartość naprawdę wychodzi (dla $y = -\frac12$).
> >
> > ---
> >
> > > [!warning] Typowa pułapka
> > > „$3^{\text{coś}}$ ma zbiór wartości $(0, \infty)$” jest prawdą tylko wtedy, gdy wykładnik może być **dowolny**, także bardzo ujemny. Tutaj wykładnik nigdy nie spada poniżej $\frac34$, więc wyniki bliskie zera (np. $3^{-5}$) są nieosiągalne. Zawsze najpierw sprawdź, jakie wartości daje „środek” (tak samo jak w [[#Zadanie 7 – dziedzina naturalna i zbiór wartości|7 c)]] przy $\log_{10}(x^2+1)$).
> >
> > **Schemat na kolokwium:** (1) zbiór wartości środka, (2) czy funkcja zewnętrzna rośnie, czy maleje, (3) wstaw końce przedziału.

#### Zadanie 8 – szkice wykresów
Teoria: [[#7. Czym jest funkcja?]]. Zasada: zrób małą **tabelkę wartości** (3–5 punktów), zaznacz charakterystyczne punkty i **podpisz osie nazwami z treści** (pozioma oś = argument, pionowa oś = wartość).

> [!success]- a)–d)
> a) $y = x^2 + 1$: parabola $x^2$ przesunięta o 1 **w górę**; wierzchołek $(0,1)$, brak miejsc zerowych. Osie: $x$, $y$.
> b) $y = z^2 - 1$: parabola przesunięta o 1 **w dół**; wierzchołek $(0,-1)$, miejsca zerowe $z = \pm1$. Osie: $z$ (pozioma), $y$ (pionowa).
> c) $t = \sqrt s$: zaczyna się w $(0,0)$, punkty $(1,1)$, $(4,2)$, $(9,3)$; tylko $s \ge 0$. Osie: $s$, $t$.
> d) $m = 2l + 3$: prosta przez $(0, 3)$ i $(-1{,}5;\ 0)$, rosnąca. Osie: $l$, $m$.
>
> > [!question]- a) dokładnie: $y = x^2 + 1$
> > **Co znaczy „naszkicuj”?** Narysuj, jak wygląda wykres, czyli wszystkie punkty $(x, y)$ spełniające wzór. Nie musi być idealnie, ale ważne miejsca muszą się zgadzać.
> >
> > **Krok 1. Tabelka.** Wybierz kilka łatwych $x$ i policz $y$: najpierw podnieś do kwadratu, potem dodaj 1.
> >
> > | $x$ | $-2$ | $-1$ | $0$ | $1$ | $2$ |
> > |---|---|---|---|---|---|
> > | $x^2$ | $4$ | $1$ | $0$ | $1$ | $4$ |
> > | $y = x^2 + 1$ | $5$ | $2$ | $1$ | $2$ | $5$ |
> >
> > Uwaga na minus: $(-2)^2 = 4$, nie $-4$. Kwadrat liczby ujemnej jest dodatni.
> >
> > **Krok 2. Zaznacz punkty i połącz gładką linią** w kształcie litery U. Łącz łukiem, a nie odcinkami.
> >
> > ```
> >             y
> >             ↑
> >     •      5┤       •
> >            4┤
> >            3┤
> >         •  2┤   •
> >            1•
> >  ───┼───┼───┼───┼───┼──→ x
> >    -2  -1   0   1   2
> > ```
> >
> > **Krok 3. Zrozum, skąd ten kształt.** Porównaj dwa ostatnie wiersze tabelki: każde $y$ jest o **1 większe** niż $x^2$. Bierzesz więc zwykłą parabolę $y = x^2$ (dołek w $(0,0)$) i **podnosisz ją całą o 1 w górę**. Dołek (wierzchołek) ląduje w $(0, 1)$.
> > Zasada ogólna: $+c$ **poza** funkcją oznacza przesunięcie o $c$ w górę, a $-c$ w dół (jak w b).
> >
> > **Krok 4. Charakterystyczne punkty do podpisania:**
> > - **Wierzchołek $(0, 1)$:** najniższy punkt, bo $x^2 \ge 0$, więc $y = x^2 + 1 \ge 1$.
> > - **Miejsca zerowe: brak.** Rozwiązujemy $x^2 + 1 = 0$, czyli $x^2 = -1$. Kwadrat nie może być ujemny, więc wykres **nigdy nie dotyka osi $x$**. Cały leży nad nią.
> > - **Przecięcie z osią $y$:** dla $x = 0$ wychodzi $y = 1$, czyli to ten sam punkt co wierzchołek.
> > - **Symetria:** $x$ i $-x$ dają to samo $y$ (np. $\pm2 \to 5$), więc wykres jest lustrzany względem osi $y$.
> >
> > **Krok 5. Osie:** pozioma $x$ (argument), pionowa $y$ (wartość), bo takie litery są we wzorze. Dorysuj strzałki.
> >
> > **Sprawdź się:** odczytaj z wykresu zbiór wartości. Najniżej jest $1$, a w górę bez końca, więc $[1, \infty)$.

> [!success]- e)–g)
> e) $z = \log_2 y$: punkty $(\frac12, -1)$, $(1, 0)$, $(2, 1)$, $(4, 2)$; tylko $y > 0$, oś pionowa to asymptota. Osie: $y$ (pozioma), $z$ (pionowa).
> f) $x = e^z$: punkty $(-1;\ 0{,}37)$, $(0, 1)$, $(1;\ 2{,}72)$; wartości zawsze $> 0$, z lewej zbliża się do osi poziomej. Osie: $z$ (pozioma), $x$ (pionowa).
> g) $z = \arcsin x$: od $(-1, -\frac{\pi}{2})$ przez $(0,0)$ do $(1, \frac{\pi}{2})$, rosnąca, tylko $x \in [-1,1]$. Osie: $x$, $z$.

#### Zadanie 9 – rozkład złożenia
Teoria: [[#9. Złożenie funkcji]]. Zapis: od **zewnętrznej** do **najbardziej wewnętrznej**.

> [!success]- a)–d)
> a) $(\sin x + 1)^5$: $\ t^5$, $\ t = \sin x + 1$
> b) $\sin(x^5 + 1)$: $\ \sin t$, $\ t = x^5 + 1$
> c) $3^{\sin x}$: $\ 3^t$, $\ t = \sin x$
> d) $\log_2(\operatorname{tg}(x^2 - 5))$: $\ \log_2 t$, $\ t = \operatorname{tg} s$, $\ s = x^2 - 5$

> [!success]- e)–g)
> e) $\sqrt[3]{\log_{10}(3x^5 + 3)}$: $\ \sqrt[3]{t}$, $\ t = \log_{10} s$, $\ s = 3x^5 + 3$
> f) $\sin^4(\log_2(x+2))$: $\ t^4$, $\ t = \sin s$, $\ s = \log_2 p$, $\ p = x + 2$
> g) $\left(\frac{1}{4x^4 + x}\right)^{88}$: $\ t^{88}$, $\ t = \frac1s$, $\ s = 4x^4 + x$

#### Zadanie 10 – złożenia i ich dziedziny
Teoria: [[#9. Złożenie funkcji]], [[#8. Dziedzina naturalna – lista kontrolna]]

> [!success]- a) $f(x) = \sqrt[3]{x^2 - 3}$, $g(x) = \frac{1}{x+2}$
> $D_f = \mathbb{R}$ (pierwiastek 3. stopnia), $D_g = \mathbb{R}\setminus\{-2\}$.
>
> $f(g(x)) = \sqrt[3]{\left(\frac{1}{x+2}\right)^2 - 3} = \sqrt[3]{\frac{1}{(x+2)^2} - 3}$
> Dziedzina: tylko $x \ne -2$ (z $g$). **$D = \mathbb{R}\setminus\{-2\}$**
>
> $g(f(x)) = \dfrac{1}{\sqrt[3]{x^2 - 3} + 2}$
> Warunek: $\sqrt[3]{x^2-3} \ne -2 \Leftrightarrow x^2 - 3 \ne -8 \Leftrightarrow x^2 \ne -5$, co jest zawsze prawdą. **$D = \mathbb{R}$**

> [!success]- b) $f(x) = \frac{x}{2x+1}$, $g(x) = 3^x$
> $D_f = \mathbb{R}\setminus\{-\frac12\}$, $D_g = \mathbb{R}$.
>
> $f(g(x)) = \dfrac{3^x}{2\cdot 3^x + 1}$. Mianownik $> 0$ zawsze. **$D = \mathbb{R}$**
>
> $g(f(x)) = 3^{\frac{x}{2x+1}}$. Warunek z $f$: $x \ne -\frac12$. **$D = \mathbb{R}\setminus\{-\frac12\}$**

> [!success]- c) $f(x) = \log_5(x+1)$, $g(x) = \sqrt x$, $h(x) = \sin(x-1)$
> **$f(g(h(x))) = \log_5\left(\sqrt{\sin(x-1)} + 1\right)$**
> - pierwiastek: $\sin(x-1) \ge 0$
> - logarytm: $\sqrt{\dots} + 1 > 0$, zawsze prawda (bo $\sqrt{\dots} \ge 0$)
> - $\sin u \ge 0 \Leftrightarrow u \in [2k\pi,\ \pi + 2k\pi]$, więc $x - 1 \in [2k\pi,\ \pi + 2k\pi]$
>
> $D = \bigcup_{k\in\mathbb{Z}} [1 + 2k\pi,\ 1 + \pi + 2k\pi]$
>
> > [!question]- Co to za zapis? Czytanie po kawałku
> > | kawałek | czytaj | znaczy |
> > |---|---|---|
> > | $[1 + 2k\pi,\ 1 + \pi + 2k\pi]$ | „przedział od … do …” | **jeden pasek** na osi liczbowej |
> > | $k$ | „numer paska” | zwykła liczba całkowita, którą sam wstawiasz |
> > | $k \in \mathbb{Z}$ | „$k$ należy do liczb całkowitych” | $k$ może być $\dots, -2, -1, 0, 1, 2, \dots$ |
> > | $\bigcup$ | „suma” (jak $\cup$, tylko duże) | **połącz wszystkie te paski w jeden zbiór** |
> >
> > **Wstaw za $k$ kolejne liczby** ($\pi \approx 3{,}14$, $2\pi \approx 6{,}28$):
> >
> > | $k$ | przedział | na liczbach |
> > |---|---|---|
> > | $-1$ | $[1 - 2\pi,\ 1 - \pi]$ | $[-5{,}28;\ -2{,}14]$ |
> > | $0$ | $[1,\ 1 + \pi]$ | $[1;\ 4{,}14]$ |
> > | $1$ | $[1 + 2\pi,\ 1 + 3\pi]$ | $[7{,}28;\ 10{,}42]$ |
> > | $2$ | $[1 + 4\pi,\ 1 + 5\pi]$ | $[13{,}57;\ 16{,}71]$ |
> >
> > Czyli cały zapis to po prostu skrót od:
> > $$D = \dots \cup [-5{,}28;\ -2{,}14] \cup [1;\ 4{,}14] \cup [7{,}28;\ 10{,}42] \cup [13{,}57;\ 16{,}71] \cup \dots$$
> > Takich pasków jest nieskończenie wiele, więc nie da się wypisać wszystkich. Dlatego piszemy jeden „wzór na pasek” z $k$ i duże $\bigcup$ („weź je wszystkie”).
> >
> > ```
> >   ███████       ███████       ███████       ███████
> > ──┼─────┼───────┼─────┼───────┼─────┼───────┼─────┼──→ x
> > −5,28 −2,14     1   4,14    7,28 10,42   13,57 16,71
> >   k=−1          k=0           k=1           k=2
> > ```
> > Każdy pasek ma długość $\pi \approx 3{,}14$ (tyle trwa „plusowy” kawałek sinusa). Przerwa między paskami też ma $\pi$. Kolejny pasek zaczyna się $2\pi \approx 6{,}28$ dalej.
>
> Typowe pytanie: czy $x = 8$ należy do dziedziny? Tak, bo $8 \in [7{,}28;\ 10{,}42]$ (pasek $k=1$). A $x = 5$? Nie, bo leży w przerwie między $4{,}14$ a $7{,}28$.
>
> **$h(g(f(x))) = \sin\left(\sqrt{\log_5(x+1)} - 1\right)$**
> - logarytm: $x + 1 > 0 \Leftrightarrow x > -1$
> - pierwiastek: $\log_5(x+1) \ge 0 = \log_5 1 \Leftrightarrow x + 1 \ge 1 \Leftrightarrow x \ge 0$
> - $\sin$: bez ograniczeń
>
> $D = [0, \infty)$
>
> > [!question]- O co chodzi? Łopatologicznie
> > **Zadanie w jednym zdaniu:** masz trzy „maszynki”: $f$, $g$, $h$. Ustaw je w kolejce na dwa sposoby, napisz wzór na całość i sprawdź, jakie $x$ wolno do niej wrzucić.
> >
> > | maszynka | co robi z liczbą, którą dostaje |
> > |---|---|
> > | $h(x) = \sin(x-1)$ | odejmuje 1, potem bierze sinus |
> > | $g(x) = \sqrt{x}$ | bierze pierwiastek |
> > | $f(x) = \log_5(x+1)$ | dodaje 1, potem bierze $\log_5$ |
> >
> > **Jak czytać $f(g(h(x)))$:** od środka, czyli od tego, co najbliżej $x$. Najpierw działa $h$, jej wynik idzie do $g$, a wynik $g$ idzie do $f$.
> >
> > ---
> >
> > ### Część 1: $f(g(h(x)))$, kolejka $h \to g \to f$
> >
> > **Budowanie wzoru krok po kroku:**
> > 1. $h$: $\quad \sin(x-1)$
> > 2. $g$ z tego: $\quad \sqrt{\sin(x-1)}$
> > 3. $f$ z tego: $f$ robi „$\log_5(\text{to, co dostałem} + 1)$”, więc $\log_5\big(\sqrt{\sin(x-1)} + 1\big)$
> >
> > Uwaga: „$+1$” należy do $f$, więc ląduje **wewnątrz** logarytmu, za pierwiastkiem.
> >
> > **Dziedzina, czyli co może się zepsuć?** Idziemy po [[#8. Dziedzina naturalna – lista kontrolna|liście kontrolnej]]:
> > - $\sin$: nie psuje się nigdy;
> > - pierwiastek: to, co jest pod nim, musi być $\ge 0$, czyli $\sin(x-1) \ge 0$;
> > - logarytm: to, co jest w środku, musi być $> 0$. W środku jest $\sqrt{\dots} + 1$. Pierwiastek daje co najmniej $0$, więc po dodaniu 1 mamy co najmniej $1$. To jest zawsze $> 0$, **więc ten warunek nic nie zmienia**.
> >
> > Zostaje jeden warunek: $\sin(x-1) \ge 0$.
> >
> > **Kiedy sinus jest $\ge 0$?** Na [[#5. Trygonometria|wykresie sinusa]] fala jest nad osią (lub na niej) od $0$ do $\pi$. Potem jest pod osią od $\pi$ do $2\pi$, a dalej wszystko się powtarza co $2\pi$. Więc:
> > $$\sin u \ge 0 \iff u \in [0, \pi] \text{ albo } [2\pi, 3\pi] \text{ albo } [-2\pi, -\pi] \dots$$
> > Krótko: $u \in [2k\pi,\ \pi + 2k\pi]$, gdzie $k$ to dowolna liczba całkowita (…, $-1$, $0$, $1$, $2$, …).
> >
> > U nas $u = x - 1$, więc dodajemy 1 do obu końców:
> > $$x \in [1 + 2k\pi,\ 1 + \pi + 2k\pi]$$
> >
> > **Jak to wygląda na liczbach** ($\pi \approx 3{,}14$):
> >
> > | $k$ | przedział |
> > |---|---|
> > | $-1$ | $[-5{,}28;\ -2{,}14]$ |
> > | $0$ | $[1;\ 4{,}14]$ |
> > | $1$ | $[7{,}28;\ 10{,}42]$ |
> >
> > Dziedzina to **wiele kawałków** (paski długości $\pi$ z przerwami długości $\pi$). Znak $\bigcup_{k\in\mathbb{Z}}$ oznacza właśnie „suma wszystkich tych kawałków, dla każdego całkowitego $k$”.
> >
> > **Sprawdzenie:**
> > - $x = 2$: $\sin 1 \approx 0{,}84 \ge 0$, więc działa ✓.
> > - $x = 5$: $\sin 4 \approx -0{,}76 < 0$, czyli pierwiastek z liczby ujemnej ✗. Zgadza się, bo $5$ leży w przerwie między $4{,}14$ a $7{,}28$.
> >
> > ---
> >
> > > [!help]- Dalej nie rozumiem sinusa: wersja tylko na liczbach
> > > **Cosinusa tu nie ma.** Interesuje nas tylko to, **kiedy sinus jest dodatni**. Policz na kalkulatorze (tryb **RAD**):
> > >
> > > | $u$ | 0 | 1 | 2 | 3 | **3,14** | 4 | 5 | 6 | **6,28** | 7 | 8 |
> > > |---|---|---|---|---|---|---|---|---|---|---|---|
> > > | $\sin u$ | 0 | 0,84 | 0,91 | 0,14 | **0** | −0,76 | −0,96 | −0,28 | **0** | 0,66 | 0,99 |
> > > | znak | 0 | + | + | + | 0 | − | − | − | 0 | + | + |
> > >
> > > - od **0 do 3,14** ($\pi$) sinus jest **dodatni**,
> > > - od **3,14 do 6,28** ($2\pi$) jest **ujemny**,
> > > - potem **wszystko się powtarza**: kawałki plus i minus, każdy długości 3,14.
> > >
> > > W zadaniu pod sinusem jest $x - 1$, a nie $x$, więc:
> > > $$0 \le x - 1 \le 3{,}14 \quad\Rightarrow\quad 1 \le x \le 4{,}14$$
> > > Następne „plusowe” kawałki są przesunięte o 6,28: $[7{,}28;\ 10{,}42]$, $[13{,}57;\ 16{,}71]$, …, a w lewo $[-5{,}28;\ -2{,}14]$, …
> > >
> > > Zapis $[1 + 2k\pi,\ 1 + \pi + 2k\pi]$ znaczy dokładnie to samo. $2k\pi$ to „przesuń o 6,28 tyle razy, ile chcesz”, a $k$ to numer kawałka.
> >
> > ### Część 2: $h(g(f(x)))$, kolejka $f \to g \to h$
> >
> > **Budowanie wzoru:**
> > 1. $f$: $\quad \log_5(x+1)$
> > 2. $g$ z tego: $\quad \sqrt{\log_5(x+1)}$
> > 3. $h$ z tego: $h$ robi „$\sin(\text{to, co dostałem} - 1)$”, więc $\sin\big(\sqrt{\log_5(x+1)} - 1\big)$
> >
> > **Dziedzina:**
> > - logarytm: w środku musi być $> 0$, czyli $x + 1 > 0$, a więc $x > -1$;
> > - pierwiastek: pod nim musi być $\ge 0$, czyli $\log_5(x+1) \ge 0$.
> >
> >   Kiedy logarytm jest $\ge 0$? Wiemy, że $\log_5 1 = 0$, a $\log_5$ rośnie. Logarytm jest więc $\ge 0$, gdy to, co w środku, jest $\ge 1$. Stąd $x + 1 \ge 1$, czyli $x \ge 0$.
> > - $\sin$: nie psuje się nigdy.
> >
> > **Część wspólna:** $x > -1$ **i** $x \ge 0$ daje $x \ge 0$ (drugi warunek jest ostrzejszy).
> > $$D = [0, \infty)$$
> >
> > **Sprawdzenie:**
> > - $x = 4$: $\log_5 5 = 1$, $\sqrt1 = 1$, $\sin(1-1) = \sin 0 = 0$, więc działa ✓.
> > - $x = -0{,}5$: $\log_5 0{,}5 < 0$, czyli pierwiastek z liczby ujemnej ✗.
> >
> > ---
> >
> > > [!tip] Morał
> > > Te same trzy funkcje w innej kolejności dają **zupełnie inny wzór i inną dziedzinę**: raz „paski” co $2\pi$, raz $[0, \infty)$. Schemat zawsze ten sam: (1) zbuduj wzór od środka, (2) wypisz warunki z każdego piętra, (3) rozwiąż je i weź część wspólną.

#### Zadanie 11* – czy funkcje są wzajemnie odwrotne?
Teoria: [[#10. Funkcja odwrotna]]. Trzeba sprawdzić **oba** złożenia.

> [!success]- a) $f(x) = \frac12(x+1)$, $f^{-1}(x) = 2x - 1$
> $f(f^{-1}(x)) = \frac12\big((2x-1) + 1\big) = \frac12\cdot 2x = x$ ✓
> $f^{-1}(f(x)) = 2\cdot\frac12(x+1) - 1 = x + 1 - 1 = x$ ✓
> **Tak, są odwrotne.**

> [!success]- b) $f(x) = \sqrt[3]{x - 1}$, $f^{-1}(x) = x^3 + 1$
> $f(f^{-1}(x)) = \sqrt[3]{(x^3 + 1) - 1} = \sqrt[3]{x^3} = x$ ✓
> $f^{-1}(f(x)) = \left(\sqrt[3]{x-1}\right)^3 + 1 = x - 1 + 1 = x$ ✓
> **Tak, są odwrotne** (na całym $\mathbb{R}$).

> [!success]- c) $f(x) = 3^x + 2$, $f^{-1}(x) = \log_3(x - 2)$
> $f^{-1}$ istnieje dla $x > 2$ (bo $W_f = (2, \infty)$).
> $f(f^{-1}(x)) = 3^{\log_3(x-2)} + 2 = (x - 2) + 2 = x$ ✓
> $f^{-1}(f(x)) = \log_3(3^x + 2 - 2) = \log_3 3^x = x$ ✓
> **Tak, są odwrotne.**

---

## Ściąga – najważniejsze wzory i zasady

> [!abstract] Na jednej stronie
> **Potęgi:** $a^0=1$ · $a^{-p}=\frac{1}{a^p}$ · $a^{1/p}=\sqrt[p]{a}$ · $a^pa^q=a^{p+q}$ · $\frac{a^p}{a^q}=a^{p-q}$ · $(a^p)^q=a^{pq}$ · $a^x>0$ zawsze (dla $a>0$): potęga liczby dodatniej nigdy nie jest $0$ ani ujemna, np. $2^{-3}=\frac18$, więc $3^x$ w mianowniku nie da zera, a $2^x=-4$ nie ma rozwiązań
>
> **Logarytmy:** $\log_a b = c \Leftrightarrow a^c = b$ · $a^{\log_a x}=x$ · $\log_a a^x = x$ · $\log(xy)=\log x+\log y$ · $\log\frac{x}{y}=\log x-\log y$ · $\log x^r = r\log x$ · $\log_a x = \frac{\log_b x}{\log_b a}$ (zmiana podstawy: na górze środek, na dole stara podstawa, $b$ wybierasz sam, np. $\log_4 8 = \frac{\log_2 8}{\log_2 4} = \frac32$)
>
> **Kwadratowe:** $\Delta = b^2-4ac$ · $x_{1,2}=\frac{-b\pm\sqrt\Delta}{2a}$ · wierzchołek $x_w=-\frac{b}{2a}$
>
> **Nierówności:** wężyk z prawej (znak liczby przy najwyższej potędze) · czynnik do kwadratu = odbicie · ułamek ↔ iloczyn · funkcja rosnąca zachowuje znak, malejąca odwraca
>
> **Trygonometria:** $\pi = 180^\circ$ · sin: $\frac{\sqrt0}{2},\frac{\sqrt1}{2},\frac{\sqrt2}{2},\frac{\sqrt3}{2},\frac{\sqrt4}{2}$ · $\sin x = a \Rightarrow x = \arcsin a + 2k\pi \lor x = \pi - \arcsin a + 2k\pi$
>
> **Arcusy:** arcsin → $[-\frac{\pi}{2},\frac{\pi}{2}]$ · arccos → $[0,\pi]$ · arctg → $(-\frac{\pi}{2},\frac{\pi}{2})$ · arcctg → $(0,\pi)$ · $\sin(\arcsin x)=x$ zawsze, $\arcsin(\sin x)=x$ tylko dla $x\in[-\frac{\pi}{2},\frac{\pi}{2}]$
>
> **Dziedzina:** mianownik $\ne 0$ · pierwiastek parzysty $\ge 0$ · logarytm $> 0$ · arcsin/arccos w $[-1,1]$ · tg: $x \ne \frac{\pi}{2}+k\pi$ · ctg: $x \ne k\pi$
>
> **Złożenie:** $f(g(x))$: najpierw $g$, potem $f$ · **Odwrotna:** $y=f(x)$ → wylicz $x$ → zamień $x \leftrightarrow y$

## Most do analizy – po co mi to?

| Temat z powtórki | Gdzie wróci w analizie |
|---|---|
| Dziedzina naturalna | **Granice**: liczy się je na brzegach dziedziny (np. $\frac1x$ przy $x \to 0$) |
| Asymptoty $a^x$, $\log_a x$, $\operatorname{tg}$, $\operatorname{arctg}$ | **Granice w nieskończoności** i asymptoty wykresu |
| Hierarchia wzrostu $\log < x^n < a^x$ | Szybkie liczenie granic typu $\frac{\infty}{\infty}$ |
| Monotoniczność | **Pochodna**: $f' > 0 \Rightarrow f$ rośnie (badanie przebiegu funkcji) |
| Złożenie funkcji | **Pochodna funkcji złożonej**: $[f(g(x))]' = f'(g(x))\cdot g'(x)$. Bez umiejętności rozkładu z zad. 9 ani rusz! |
| Funkcja odwrotna | Pochodne $\ln x$, $\arcsin x$, $\operatorname{arctg} x$ wyprowadza się z funkcji odwrotnej |
| Prawa logarytmów i potęg | Upraszczanie wyrażeń przed różniczkowaniem i całkowaniem |
| Nierówności (wężyk) | Wyznaczanie, gdzie $f' > 0$ (przedziały monotoniczności) |

> [!check] Gotowy na kolejny etap, jeśli bez zaglądania potrafisz:
> - [ ] wyznaczyć dziedzinę funkcji z ułamkiem, pierwiastkiem i logarytmem jednocześnie
> - [ ] rozwiązać nierówność wielomianową i ułamkową metodą wężyka
> - [ ] policzyć $\log_8 2$, $5^{2+\log_5 3}$, $\arcsin(-\frac{\sqrt2}{2})$
> - [ ] rozpisać $\sqrt{\ln(\cos x^2)}$ na funkcje od zewnętrznej do wewnętrznej
> - [ ] naszkicować z pamięci $e^x$, $\ln x$, $\sin x$, $\operatorname{tg} x$, $\arcsin x$, $\operatorname{arctg} x$
> - [ ] wyjaśnić, dlaczego $\arcsin(\sin\pi) = 0$
>
> Odpowiedzi do testu: $\log_8 2 = \frac13$ · $5^{2+\log_5 3} = 75$ · $\arcsin(-\frac{\sqrt2}{2}) = -\frac{\pi}{4}$ · $\sqrt{t}$, $t = \ln s$, $s = \cos p$, $p = x^2$

### Przykłady do przećwiczenia (do listy powyżej)

Najpierw rozwiąż sam, dopiero potem rozwiń wyniki.

> [!example] 1. Dziedzina: ułamek, pierwiastek i logarytm naraz
> Teoria: [[#8. Dziedzina naturalna – lista kontrolna]]. Wyznacz dziedzinę:
> a) $f(x) = \dfrac{\sqrt{x+3}}{x-1} + \log(5-x)$
> b) $g(x) = \dfrac{\ln(x^2-4)}{x-3}$
> c) $h(x) = \dfrac{\sqrt{4-x}}{\ln x}$
>
> > [!success]- Wyniki
> > a) $x + 3 \ge 0$, $x \ne 1$, $5 - x > 0$, więc $D = [-3, 1) \cup (1, 5)$
> > b) $x^2 - 4 > 0 \Leftrightarrow x < -2 \lor x > 2$, do tego $x \ne 3$, więc $D = (-\infty, -2) \cup (2, 3) \cup (3, \infty)$
> > c) $x > 0$ (log), $\ln x \ne 0 \Leftrightarrow x \ne 1$ (mianownik), $4 - x \ge 0 \Leftrightarrow x \le 4$, więc $D = (0, 1) \cup (1, 4]$

> [!example] 2. Nierówności metodą wężyka
> Teoria: [[#4.2 Nierówności wielomianowe – metoda wężyka]], [[#4.3 Nierówności z ułamkiem]]. Rozwiąż:
> a) $(x-1)(x+2)(x-4) > 0$
> b) $x^2(x-3) \le 0$
> c) $\dfrac{x+1}{x-2} \ge 0$
> d) $\dfrac{x-3}{x+1} < 1$
>
> > [!success]- Wyniki
> > a) Pierwiastki: $-2, 1, 4$. Wężyk startuje z prawej od góry. $x \in (-2, 1) \cup (4, \infty)$
> > b) $x = 0$ jest podwójny (odbicie), $x = 3$ pojedynczy. $x \in (-\infty, 3]$. Sprawdź: $x = 0$ daje $0 \le 0$ ✓
> > c) Tak jak $(x+1)(x-2) \ge 0$, ale $x \ne 2$. $x \in (-\infty, -1] \cup (2, \infty)$
> > d) **Nie mnóż przez mianownik!** Przenieś $1$ na lewo: $\dfrac{x-3}{x+1} - 1 = \dfrac{-4}{x+1} < 0$. Licznik jest ujemny, więc mianownik musi być dodatni: $x + 1 > 0$. $x \in (-1, \infty)$

> [!example] 3. Policz (logarytmy, potęgi, arcusy)
> Teoria: [[#2. Logarytmy]], [[#6. Funkcje cyklometryczne (arcusy)]]
> a) $\log_9 3$ b) $\log_2 \frac18$ c) $\log_{27} 9$
> d) $3^{1+\log_3 4}$ e) $2^{3-\log_2 5}$ f) $e^{2\ln 3}$
> g) $\arcsin\frac12$ h) $\arccos(-\frac12)$ i) $\operatorname{arctg}(-\sqrt3)$
>
> > [!success]- Wyniki
> > a) $\frac12$, bo $9^{1/2} = 3$
> > b) $-3$, bo $2^{-3} = \frac18$
> > c) $\frac23$, bo $27^{2/3} = (\sqrt[3]{27})^2 = 9$ (albo zmianą podstawy: $\frac{\log_3 9}{\log_3 27} = \frac23$)
> > d) $3^1 \cdot 3^{\log_3 4} = 3 \cdot 4 = 12$
> > e) $\dfrac{2^3}{2^{\log_2 5}} = \dfrac85$
> > f) $e^{\ln 3^2} = 3^2 = 9$
> > g) $\frac{\pi}{6}$
> > h) $\frac{2\pi}{3}$ (arccos daje wynik z $[0, \pi]$)
> > i) $-\frac{\pi}{3}$ (arctg daje wynik z $(-\frac{\pi}{2}, \frac{\pi}{2})$)

> [!example] 4. Rozpisz złożenie od zewnątrz do środka
> Teoria: [[#9. Złożenie funkcji]]. Pytanie pomocnicze: *co kalkulator liczy na końcu?*
> a) $e^{\sin 3x}$ b) $\ln^2(x+1)$ c) $\sqrt{\operatorname{arctg}\frac1x}$ d) $\sin\sqrt{\ln x}$ e) $\cos^3(2^x)$
>
> > [!success]- Wyniki
> > a) $e^t$, $t = \sin s$, $s = 3x$
> > b) $t^2$, $t = \ln s$, $s = x + 1$ (bo $\ln^2(\dots) = \big(\ln(\dots)\big)^2$)
> > c) $\sqrt t$, $t = \operatorname{arctg} s$, $s = \frac1x$
> > d) $\sin t$, $t = \sqrt s$, $s = \ln x$
> > e) $t^3$, $t = \cos s$, $s = 2^x$

> [!example] 5. Szkice z pamięci
> Teoria: rozdziały 1, 2, 5, 6. Naszkicuj i zaznacz charakterystyczne punkty oraz asymptoty:
> a) $e^x$ b) $\ln x$ c) $\sin x$ d) $\operatorname{tg} x$ e) $\arcsin x$ f) $\operatorname{arctg} x$
> Bonus (przesunięcia): g) $y = e^x - 1$ h) $y = \ln(x-2)$ i) $y = \sin x + 1$
>
> > [!success]- Co musi być na rysunku
> > a) $e^x$: przez $(0, 1)$ i $(1;\ 2{,}72)$, zawsze nad osią $x$, z lewej przytula się do $y = 0$ (asymptota), rośnie.
> > b) $\ln x$: tylko $x > 0$, przez $(1, 0)$ i $(2{,}72;\ 1)$, oś $y$ to asymptota, rośnie. To odbicie $e^x$ względem $y = x$.
> > c) $\sin x$: fala między $-1$ a $1$, zera w $0, \pi, 2\pi$, szczyt $1$ w $\frac{\pi}{2}$, dołek $-1$ w $\frac{3\pi}{2}$, okres $2\pi$ (rysunek w [[#5.2 Czym są sin, cos, tg, ctg|5.2]]).
> > d) $\operatorname{tg} x$: zera w $0, \pi, \dots$, pionowe asymptoty w $\pm\frac{\pi}{2}, \frac{3\pi}{2}, \dots$, przez $(\frac{\pi}{4}, 1)$, na każdym kawałku rośnie od $-\infty$ do $\infty$, okres $\pi$.
> > e) $\arcsin x$: tylko $x \in [-1, 1]$, od $(-1, -\frac{\pi}{2})$ przez $(0, 0)$ do $(1, \frac{\pi}{2})$, rośnie.
> > f) $\operatorname{arctg} x$: całe $\mathbb{R}$, przez $(0, 0)$ i $(1, \frac{\pi}{4})$, poziome asymptoty $y = \pm\frac{\pi}{2}$, rośnie.
> > g) $e^x$ przesunięte o 1 w **dół**: przez $(0, 0)$, asymptota $y = -1$, wartości $(-1, \infty)$.
> > h) $\ln x$ przesunięty o 2 w **prawo**: tylko $x > 2$, przez $(3, 0)$, asymptota $x = 2$.
> > i) $\sin x$ podniesiony o 1: fala między $0$ a $2$, szczyt $2$ w $\frac{\pi}{2}$, dotyka osi w $\frac{3\pi}{2}$.

> [!example] 6. Arcus z funkcji (jak $\arcsin(\sin\pi) = 0$)
> Teoria: [[#6. Funkcje cyklometryczne (arcusy)]]. Pamiętaj: arcus zawsze oddaje kąt **ze swojego przedziału**.
> a) $\arcsin(\sin\frac{\pi}{4})$ b) $\arcsin(\sin\frac{5\pi}{6})$ c) $\arccos(\cos(-\frac{\pi}{3}))$
> d) $\operatorname{arctg}(\operatorname{tg}\frac{3\pi}{4})$ e) $\sin(\arcsin 0{,}3)$ f)* $\arcsin(\sin 2)$
>
> > [!success]- Wyniki
> > a) $\frac{\pi}{4}$, bo $\frac{\pi}{4} \in [-\frac{\pi}{2}, \frac{\pi}{2}]$, więc „wraca” to samo.
> > b) $\sin\frac{5\pi}{6} = \frac12$, a $\arcsin\frac12 = \frac{\pi}{6}$. **Nie** $\frac{5\pi}{6}$, bo to jest poza $[-\frac{\pi}{2}, \frac{\pi}{2}]$.
> > c) $\cos(-\frac{\pi}{3}) = \frac12$, a $\arccos\frac12 = \frac{\pi}{3}$. Arccos daje wynik z $[0, \pi]$, więc nie może być ujemny.
> > d) $\operatorname{tg}\frac{3\pi}{4} = -1$, a $\operatorname{arctg}(-1) = -\frac{\pi}{4}$.
> > e) $0{,}3$. W tę stronę ($\sin$ z $\arcsin$) zawsze wraca to samo.
> > f) $\sin 2 = \sin(\pi - 2)$, a $\pi - 2 \approx 1{,}14$ leży w $[-\frac{\pi}{2}, \frac{\pi}{2}]$, więc wynik to $\pi - 2$.
