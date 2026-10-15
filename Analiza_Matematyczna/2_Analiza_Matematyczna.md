---
skrot: AM
wyklad: W2
temat: Ciągłość, asymptoty, pochodne
tags:
  - pjatk
  - analiza
---
# AM – W2: Ciągłość, asymptoty, pochodne

Poprzednio: [[1_Analiza_Matematyczna|W1 – ciągi i granice]] · [[0_Analiza_Matematyczna|W0 – powtórzenie funkcji]]

Materiały: [[W2_ciaglosc_asymptoty_pochodne_funkcji.pdf|Wykład 2 (PDF)]] · [[Z03 granice funkcji asymptoty.pdf|Zadania Z03 (PDF)]] · [[Z03 granice funkcji asymptoty_Rozwiazania.pdf|Rozwiązania Z03]] · [[Z03 granice funkcji dodatkowe.pdf|Z03 dodatkowe]] · [[Z03 granice funkcji dodatkowe_Rozwiazania.pdf|Rozwiązania Z03 dodatkowe]] · [[Z04 pochodne.pdf|Zadania Z04 (PDF)]] · [[Z04 pochodne_Rozwiazania.pdf|Rozwiązania Z04]]

> [!abstract] O co chodzi w tym wykładzie?
> W W1 liczyłeś granice **ciągów** ($n \to \infty$). Teraz te same narzędzia stosujesz do **funkcji** i dostajesz trzy nowe pojęcia:
> 1. **Ciągłość**: wykres da się narysować bez odrywania ołówka. Formalnie: granica w punkcie = wartość w punkcie.
> 2. **Asymptoty**: proste, do których wykres „przykleja się” daleko albo przy dziurze w dziedzinie. Szuka się ich granicami.
> 3. **Pochodna**: jak **stromo** jest w danym miejscu wykresu, czyli jak szybko funkcja się zmienia. To też jest granica, typu $\frac00$.
>
> Wszystko to granice. Kto umie W1, ma tu z górki. Nowością są tylko **reguły liczenia pochodnych**, które trzeba wyćwiczyć jak tabliczkę mnożenia.

> [!quote] Po co mi to?
> - **Ciągłość** to gwarancja „bez skoków”. Dzięki niej komputer może szukać miejsc zerowych metodą bisekcji (rozdz. 2.4).
> - **Asymptota** odpowiada na pytanie, do czego coś dąży: ile maksymalnie przyspieszy program na 1000 rdzeniach i dlaczego serwer przy 99% obciążenia „umiera” (rozdz. 3).
> - **Pochodna** to prędkość zmian: prędkościomierz, tempo wzrostu użytkowników, a w uczeniu maszynowym kierunek, w którym poprawia się model (rozdz. 4 i 7.4).
>
> Ramki **🌍 Z życia** w rozdziałach pokazują konkretne przykłady.

> [!info] Jak się uczyć z tej notatki
> **Treść:** materiał z **W2** oraz zadania **Z03** (granice funkcji, ciągłość, asymptoty), **Z03 dodatkowe** (dla ambitnych) i **Z04** (pochodne). Uwaga: kartki Z03 i Z04 mają w nagłówku „Wykład 3” i „Wykład 4”, bo tak numeruje je prowadzący, ale to materiał z tego wykładu.
>
> **Czytaj po kolei.** Rozdziały budują jeden na drugim. Gdy potrzebna jest wiedza z W1 albo W0, jest link.
>
> | Rozdziały | Potem zadania |
> |---|---|
> | 0 Symbole, 1 Granica funkcji | Z03: 1–7 |
> | 2 Ciągłość | Z03: 8–10 |
> | 3 Asymptoty | Z03: 11–12 |
> | 4 Definicja pochodnej, 5 Gdzie jej nie ma | Z04: 0 |
> | 6 Tablica pochodnych | Z04: 1 |
> | 7 Reguły różniczkowania | Z04: 2 |
> | 8 Potęga z $x$ w wykładniku | Z04: 3* |
> | 9 Wyższe rzędy | Z04: 4–5 |
> | 10 Styczna | Z04: 6–7 |
>
> Na kolokwium **zawsze uzasadniaj**. Typ granicy dopisuj w nawiasie kwadratowym, np. $\left[\frac00\right]$ (zwyczaj wyjaśniony w [[1_Analiza_Matematyczna#0. Słowniczek symboli|W1, rozdz. 0]]).

---

## Wykład

### W2 – Ciągłość, asymptoty, pochodne

#### 0. Słowniczek symboli

| Symbol | Czytamy | Przykład |
|---|---|---|
| $\lim\limits_{x\to a} f(x)$ | „granica $f$, gdy $x$ dąży do $a$” | $\lim\limits_{x\to2} x^2 = 4$ |
| $x \to a^+$ / $x \to a^-$ | $x$ dąży do $a$ **z prawej** (większe od $a$) / **z lewej** (mniejsze) | $x \to 0^+$: $0{,}1;\ 0{,}01;\ 0{,}001\dots$ |
| $\lvert x\rvert$ | wartość bezwzględna: „odległość od zera” | $\lvert -3\rvert = 3$; $\ \sqrt{x^2} = \lvert x\rvert$ |
| otoczenie punktu $a$ | mały przedział wokół $a$, np. $(a - 0{,}01;\ a + 0{,}01)$ | |
| $\Delta x$, $\Delta f$ | „delta”: **przyrost** (zmiana) $x$ i zmiana wartości $f$ | $\Delta x = x - a$ |
| $f'(x)$ | „$f$ prim”: **pochodna** $f$ | $(x^2)' = 2x$ |
| $\dfrac{df}{dx}$, $\dfrac{d}{dx}f$ | inny zapis pochodnej (Leibniz) | $\frac{d}{dx}(x^2) = 2x$ |
| $f''$, $f'''$, $f^{(n)}$ | pochodna 2., 3., $n$-tego rzędu | $(x^3)'' = 6x$ |
| różniczkować | liczyć pochodną | |
| $\operatorname{tg} = \tan$, $\operatorname{ctg} = \cot$, $\operatorname{arctg} = \arctan$ | ta sama funkcja, różne zapisy | |

---

#### 1. Granica funkcji – co nowego względem ciągów

Granica funkcji pojawiła się w [[1_Analiza_Matematyczna#10. Granica funkcji (zapowiedź Z03)|W1, rozdz. 10]]. Tu ją rozbudowujemy, bo na niej stoi cały W2.

##### 1.1 Dwie strony i nieskończoność

Przy ciągu $n$ mogło iść tylko w jedną stronę: do $\infty$. Przy funkcji $x$ może:
- dążyć do **liczby** $a$, i to **z dwóch stron**: z lewej ($x \to a^-$) i z prawej ($x \to a^+$),
- dążyć do $+\infty$ **albo** do $-\infty$.

> [!important] Granica w punkcie istnieje ⇔ obie jednostronne istnieją i są równe
> $$\lim_{x\to a} f(x) = g \quad\Longleftrightarrow\quad \lim_{x\to a^-} f(x) = \lim_{x\to a^+} f(x) = g$$

**Wszystko z W1 działa dalej**, tylko piszesz $x$ zamiast $n$: najwyższa potęga, sprzężenie, liczba $e$, trzy ciągi (tu: trzy funkcje), hierarchia wzrostu.

> [!question] ✏️ Sprawdź się – 1.1
> Czy granica istnieje? Jeśli tak, podaj ją.
> a) $\lim\limits_{x\to2} f(x)$ dla $f(x) = x + 1$ przy $x < 2$ i $f(x) = 5 - x$ przy $x \ge 2$
> b) $\lim\limits_{x\to1} f(x)$ dla $f(x) = x^2$ przy $x < 1$ i $f(x) = 2x$ przy $x \ge 1$
> c) Wiadomo tylko, że $\lim\limits_{x\to0^-} f(x) = 4$ i $\lim\limits_{x\to0^+} f(x) = 4$. Ile wynosi $\lim\limits_{x\to0} f(x)$?
>
> > [!success]- Rozwiązanie
> > a) Z lewej: $x + 1 \to 3$. Z prawej: $5 - x \to 3$. Równe, więc granica **istnieje** i wynosi $3$.
> > b) Z lewej: $x^2 \to 1$. Z prawej: $2x \to 2$. $1 \ne 2$, więc granica **nie istnieje**.
> > c) Obie jednostronne istnieją i są równe, więc $\lim\limits_{x\to0} f(x) = 4$. Nie ma znaczenia, ile wynosi $f(0)$ (i czy w ogóle istnieje).

##### 1.2 Granice w plus i minus nieskończoności

Przy $x \to +\infty$ wszystko jest jak w W1. Przy $x \to -\infty$ trzeba uważać na **znaki**:

| Wyrażenie | $x \to +\infty$ | $x \to -\infty$ | Dlaczego |
|---|---|---|---|
| $x^2$, $x^4$ (parzyste) | $+\infty$ | $+\infty$ | $(-1000)^2 > 0$ |
| $x^3$, $x^5$ (nieparzyste) | $+\infty$ | $-\infty$ | $(-10)^3 = -1000$ |
| $2^x$ | $+\infty$ | $0$ | $2^{-100} = \frac{1}{2^{100}}$ |
| $\operatorname{arctg} x$ | $\frac{\pi}{2}$ | $-\frac{\pi}{2}$ | poziome asymptoty arctg z W0 |
| $\operatorname{arcctg} x$ | $0$ | $\pi$ | |
| $\sqrt{x^2}$ | $x$ | $\mathbf{-x}$ | $\sqrt{x^2} = \lvert x\rvert$ |

> [!danger] Najważniejsza pułapka przy $x \to -\infty$: $\sqrt{x^2} = \lvert x\rvert = -x$
> Dla ujemnych $x$ pierwiastek z kwadratu daje **liczbę przeciwną**: $\sqrt{(-5)^2} = \sqrt{25} = 5 = -(-5)$.
>
> Dlatego wyciągając $x$ spod pierwiastka przy $x \to -\infty$ piszesz:
> $$\sqrt{x^2 + 4x + 5} = \lvert x\rvert\sqrt{1 + \tfrac4x + \tfrac{5}{x^2}} = -x\sqrt{1 + \tfrac4x + \tfrac{5}{x^2}}$$
> Przykład: $\lim\limits_{x\to-\infty}\left(\sqrt{x^2} + x\right) = \lim(-x + x) = 0$, a nie $\infty$! (zadanie Z03 2g)

> [!question] ✏️ Sprawdź się – 1.2
> a) $\lim\limits_{x\to-\infty}\left(x^3 - 5x^2\right)$ b) $\lim\limits_{x\to-\infty}\left(5^x + \operatorname{arctg} x\right)$ c) $\lim\limits_{x\to-\infty}\dfrac{3x + 1}{\sqrt{x^2 + 4}}$
>
> > [!success]- Rozwiązanie
> > a) Wyciągam szefa: $x^3\left(1 - \frac5x\right)$, typ $[(-\infty)\cdot 1] = -\infty$ (potęga nieparzysta).
> > b) $5^x \to 0$, $\ \operatorname{arctg} x \to -\frac{\pi}{2}$. Wynik: $-\frac{\pi}{2}$.
> > c) Przy $x \to -\infty$: $\sqrt{x^2 + 4} = \lvert x\rvert\sqrt{1 + \frac{4}{x^2}} = -x\sqrt{1 + \frac{4}{x^2}}$. Zatem
> > $$\frac{x\left(3 + \frac1x\right)}{-x\sqrt{1 + \frac{4}{x^2}}} = \frac{3 + \frac1x}{-\sqrt{1 + \frac{4}{x^2}}} \to \frac{3}{-1} = -3$$
> > (Bez minusa wyszłoby $3$, czyli błąd z ramki wyżej.)

##### 1.3 Granica w punkcie – najpierw wstaw

> [!tip] Algorytm na $\lim\limits_{x\to a} f(x)$
> 1. **Wstaw $a$** do wzoru. Jeśli wychodzi zwykła liczba, to **koniec** (funkcje elementarne są ciągłe, rozdz. 2). Np. $\lim\limits_{x\to1}\frac{x^2+2x+1}{x^3+1} = \frac{4}{2} = 2$.
> 2. Wychodzi $\left[\frac{\text{liczba} \ne 0}{0}\right]$: będzie $\pm\infty$. **Policz granice jednostronne**, patrząc na znak mianownika z lewej i z prawej.
> 3. Wychodzi $\left[\frac00\right]$: symbol nieoznaczony. **Skróć** (rozłóż na czynniki) albo użyj **sprzężenia** (1.4), albo $\frac{\sin x}{x}$ (1.6).

> [!example] Krok 2: badanie znaku. $\lim\limits_{x\to1}\dfrac{1}{x^2-1}$
> Wstawiam: $\left[\frac{1}{0}\right]$. Rozkładam mianownik: $(x-1)(x+1)$.
> - $x \to 1^+$ (np. $x = 1{,}01$): $x - 1 > 0$, $x + 1 > 0$, mianownik $\to 0^+$, więc $\left[\frac{1}{0^+}\right] = +\infty$.
> - $x \to 1^-$ (np. $x = 0{,}99$): $x - 1 < 0$, mianownik $\to 0^-$, więc $\left[\frac{1}{0^-}\right] = -\infty$.
>
> Jednostronne są różne, więc granica w $1$ **nie istnieje** (ale są dwie granice niewłaściwe, czyli asymptota pionowa, rozdz. 3).
>
> **Trik:** podstaw liczbę „tuż obok” ($1{,}01$ albo $0{,}99$) i sprawdź tylko **znak** mianownika.

> [!question] ✏️ Sprawdź się – 1.3
> a) $\lim\limits_{x\to2}\dfrac{x^2 + 1}{x + 3}$ b) $\lim\limits_{x\to3^+}\dfrac{x + 1}{x^2 - 9}$ i $\lim\limits_{x\to3^-}\dfrac{x + 1}{x^2 - 9}$ c) $\lim\limits_{x\to-1}\dfrac{2}{(x + 1)^2}$
>
> > [!success]- Rozwiązanie
> > a) Wstawiam: $\frac{4 + 1}{2 + 3} = \frac55 = 1$. Koniec.
> > b) Wstawiam: $\left[\frac{4}{0}\right]$. Mianownik: $(x - 3)(x + 3)$. Dla $x = 3{,}01$: $x - 3 > 0$, więc $\left[\frac{4}{0^+}\right] = +\infty$. Dla $x = 2{,}99$: $x - 3 < 0$, więc $\left[\frac{4}{0^-}\right] = -\infty$. Granica w $3$ nie istnieje.
> > c) $\left[\frac{2}{0}\right]$, ale $(x + 1)^2 \ge 0$ z obu stron, więc $\left[\frac{2}{0^+}\right] = +\infty$ z lewej i z prawej. Granica (niewłaściwa) wynosi $+\infty$.

##### 1.4 Typ zero przez zero – skróć albo sprzężenie

$\left[\frac00\right]$ w punkcie $a$ oznacza zwykle, że licznik i mianownik **mają wspólny czynnik** $(x - a)$, który trzeba „wydłubać” i skrócić.

> [!example] Rozkład na czynniki (Z03 dodatkowe 1b)
> $\lim\limits_{x\to3}\dfrac{x^2-10x+21}{x^2-8x+15}\left[\frac00\right]$. Miejsca zerowe z delty: licznik $3$ i $7$, mianownik $3$ i $5$.
> $$\frac{(x-3)(x-7)}{(x-3)(x-5)} = \frac{x-7}{x-5} \to \frac{3-7}{3-5} = 2$$
> Skoro wyszło $\left[\frac00\right]$ przy $x \to 3$, to $x = 3$ **na pewno** jest pierwiastkiem obu wielomianów. Szukasz czynnika $(x - 3)$.

> [!example] Sprzężenie (Z03 4d)
> $\lim\limits_{x\to25}\dfrac{\sqrt x - 5}{x - 25}\left[\frac00\right]$. Zauważ, że $x - 25 = (\sqrt x - 5)(\sqrt x + 5)$ (wzór $a^2 - b^2$):
> $$\frac{\sqrt x - 5}{(\sqrt x - 5)(\sqrt x + 5)} = \frac{1}{\sqrt x + 5} \to \frac{1}{10}$$
> Ogólnie: pierwiastek w różnicy, więc mnożysz przez sprzężenie, jak w [[1_Analiza_Matematyczna#6.3 Różnica pierwiastków (∞ − ∞) – sprzężenie|W1, 6.3]].

Przydatne wzory skróconego mnożenia: $a^2 - b^2 = (a-b)(a+b)$, $\ a^3 - b^3 = (a-b)(a^2+ab+b^2)$, $\ a^3 + b^3 = (a+b)(a^2-ab+b^2)$.

> [!question] ✏️ Sprawdź się – 1.4
> a) $\lim\limits_{x\to2}\dfrac{x^2 - 5x + 6}{x^2 - 4}$ b) $\lim\limits_{x\to1}\dfrac{x^3 - 1}{x^2 - 1}$ c) $\lim\limits_{x\to0}\dfrac{\sqrt{x + 4} - 2}{x}$
>
> > [!success]- Rozwiązanie
> > a) $\left[\frac00\right]$. Licznik: pierwiastki $2$ i $3$; mianownik: $(x - 2)(x + 2)$.
> > $$\frac{(x - 2)(x - 3)}{(x - 2)(x + 2)} = \frac{x - 3}{x + 2} \to \frac{-1}{4} = -\frac14$$
> > b) $\left[\frac00\right]$. Wzór $a^3 - b^3$: $\ x^3 - 1 = (x - 1)(x^2 + x + 1)$, a $x^2 - 1 = (x - 1)(x + 1)$.
> > $$\frac{x^2 + x + 1}{x + 1} \to \frac{3}{2}$$
> > c) $\left[\frac00\right]$, pierwiastek w różnicy, więc sprzężenie:
> > $$\frac{\sqrt{x + 4} - 2}{x}\cdot\frac{\sqrt{x + 4} + 2}{\sqrt{x + 4} + 2} = \frac{x + 4 - 4}{x\left(\sqrt{x + 4} + 2\right)} = \frac{1}{\sqrt{x + 4} + 2} \to \frac14$$

##### 1.5 Ważne granice funkcji

> [!important] Tabelka z kartki Z03 (naucz się jej)
> | # | Granica | Uwagi |
> |---|---|---|
> | 1 | $\lim\limits_{x\to\infty} x^p = \infty$ ($p>0$), $\ 1$ ($p=0$), $\ 0$ ($p<0$) | jak w W1 |
> | 2 | $\lim\limits_{x\to\infty} p^x = \infty$ ($p>1$), $\ 0$ ($0<p<1$); w $-\infty$ odwrotnie | |
> | 3 | $\lim\limits_{x\to\pm\infty}\left(1 + \frac{C}{x}\right)^x = e^C$ | liczba $e$ z W1 |
> | 4 | $\lim\limits_{x\to0}\dfrac{\sin x}{x} = 1$ | **najważniejsza nowa** (1.6) |
> | 5 | $\lim\limits_{x\to0^+}\ln x = -\infty$, $\ \lim\limits_{x\to\infty}\ln x = \infty$ | |
> | 6 | $\operatorname{arctg}$: $\to -\frac{\pi}{2}$ w $-\infty$, $\to \frac{\pi}{2}$ w $\infty$; $\ \operatorname{arcctg}$: $\to \pi$ w $-\infty$, $\to 0$ w $\infty$ | |

> [!tip] Bonus: granice „pochodne” od tych z tabelki (przydają się w Z03 12l i później)
> Wszystkie przy $t \to 0$:
> - $\dfrac{\operatorname{tg} t}{t} = \dfrac{\sin t}{t}\cdot\dfrac{1}{\cos t} \to 1\cdot 1 = 1$
> - $(1 + t)^{1/t} \to e$ (podstaw $x = \frac1t$ we wzór 3)
> - $\dfrac{\ln(1+t)}{t} = \ln(1+t)^{1/t} \to \ln e = 1$
> - $\dfrac{e^t - 1}{t} \to 1$ (podstaw $u = e^t - 1$, czyli $t = \ln(1+u)$, i użyj poprzedniej)
> - $\dfrac{\operatorname{arctg} t}{t} \to 1$ (podstaw $t = \operatorname{tg} s$)
>
> Morał: **dla małych $t$:** $\sin t \approx t$, $\operatorname{tg} t \approx t$, $\ln(1+t) \approx t$, $e^t - 1 \approx t$.

> [!question] ✏️ Sprawdź się – 1.5
> a) $\lim\limits_{x\to\infty}\left(1 + \dfrac4x\right)^x$ b) $\lim\limits_{x\to\infty}\left(\operatorname{arctg} x + \left(\tfrac13\right)^x\right)$ c) $\lim\limits_{x\to0}\dfrac{\ln(1 + 2x)}{x}$ d) $\lim\limits_{x\to0}\dfrac{e^{3x} - 1}{x}$
>
> > [!success]- Rozwiązanie
> > a) Wzór 3 z tabelki z $C = 4$: wynik $e^4$.
> > b) $\operatorname{arctg} x \to \frac{\pi}{2}$, a $\left(\frac13\right)^x \to 0$ (podstawa między $0$ a $1$). Wynik: $\frac{\pi}{2}$.
> > c) $\left[\frac00\right]$. Dopasowuję mianownik: $\frac{\ln(1 + 2x)}{x} = 2\cdot\underbrace{\frac{\ln(1 + 2x)}{2x}}_{\to 1} \to 2$ (bonus z $t = 2x$).
> > d) $\left[\frac00\right]$. $\frac{e^{3x} - 1}{x} = 3\cdot\underbrace{\frac{e^{3x} - 1}{3x}}_{\to 1} \to 3$.

##### 1.6 Typ sin x przez x

$\lim\limits_{x\to0}\frac{\sin x}{x} = 1$ działa także, gdy zamiast $x$ stoi **cokolwiek, co dąży do zera**, ale **to samo** na górze w sinusie i na dole:
$$\frac{\sin(\heartsuit)}{\heartsuit} \to 1, \qquad\text{gdy } \heartsuit \to 0$$

> [!tip] Przepis: „dopasuj mianownik do sinusa”
> $\lim\limits_{x\to0}\dfrac{\sin 3x}{5x}$. W sinusie jest $3x$, więc chcę $3x$ na dole. Mnożę i dzielę przez $3$:
> $$\frac{\sin 3x}{5x} = \frac{\sin 3x}{3x}\cdot\frac{3x}{5x} = \underbrace{\frac{\sin 3x}{3x}}_{\to 1}\cdot\frac35 \to \frac35$$
> Dwa sinusy: $\dfrac{\sin 2x}{\sin 7x} = \dfrac{\frac{\sin 2x}{2x}\cdot 2x}{\frac{\sin 7x}{7x}\cdot 7x} \to \dfrac{2x}{7x} = \dfrac27$
>
> **Szybki sprawdzian w głowie:** $\sin(\text{małe}) \approx \text{małe}$, więc $\frac{\sin 3x}{5x} \approx \frac{3x}{5x} = \frac35$.

> [!warning] Działa tylko, gdy argument sinusa dąży do 0!
> $\lim\limits_{x\to2^+}\dfrac{\sin x}{x^2} = \dfrac{\sin 2}{4}$. Tu po prostu **wstawiasz**, bo nie ma żadnego symbolu nieoznaczonego (Z03 6f, pułapka).
> Przesunięty punkt: $\lim\limits_{x\to5}\frac{x-5}{\sin(3(x-5))}$. Podstawiasz $t = x - 5 \to 0$ i masz $\frac{t}{\sin 3t} \to \frac13$.

> [!question] ✏️ Sprawdź się – 1.6
> a) $\lim\limits_{x\to0}\dfrac{\sin 6x}{2x}$ b) $\lim\limits_{x\to0}\dfrac{\sin 5x}{\sin 2x}$ c) $\lim\limits_{x\to1}\dfrac{\sin(x - 1)}{x^2 - 1}$ d) $\lim\limits_{x\to\pi}\dfrac{\sin x}{x}$
>
> > [!success]- Rozwiązanie
> > a) $\left[\frac00\right]$. $\frac{\sin 6x}{6x}\cdot\frac{6x}{2x} \to 1\cdot 3 = 3$.
> > b) $\left[\frac00\right]$. $\dfrac{\frac{\sin 5x}{5x}\cdot 5x}{\frac{\sin 2x}{2x}\cdot 2x} \to \dfrac{5x}{2x} = \dfrac52$.
> > c) $\left[\frac00\right]$. Podstawiam $t = x - 1 \to 0$ i rozkładam mianownik: $\frac{\sin(x - 1)}{(x - 1)(x + 1)} = \underbrace{\frac{\sin(x - 1)}{x - 1}}_{\to 1}\cdot\frac{1}{x + 1} \to \frac12$.
> > d) Pułapka: argument sinusa dąży do $\pi$, a nie do $0$. Nie ma symbolu nieoznaczonego, więc **wstawiam**: $\frac{\sin\pi}{\pi} = \frac{0}{\pi} = 0$.

##### 1.7 Typ e dla funkcji

Działa to samo co w [[1_Analiza_Matematyczna#9. Liczba e i symbol jeden do nieskończoności|W1, rozdz. 9]], tylko $x$ może dążyć także do **zera**:
$$\lim_{x\to0}(1 + x)^{1/x} = e, \qquad \lim_{x\to0}(1 + ax)^{1/x} = e^a$$

> [!tip] Szybki wzór z W1 działa i tu
> Typ $1^\infty$: podstawa $p(x) \to 1$, wykładnik $w(x) \to \pm\infty$. Wtedy $\lim p^w = e^{\lim (p - 1)\cdot w}$.
> Przykład: $\lim\limits_{x\to\infty}\left(\frac{2x-1}{2x+5}\right)^{3x}$: $\ p - 1 = \frac{-6}{2x+5}$, $\ (p-1)\cdot 3x = \frac{-18x}{2x+5} \to -9$. Wynik: $e^{-9}$.
> Na kolokwium rozpisz „po bożemu” (dopasowanie wykładnika), skrótem tylko sprawdzaj.

> [!question] ✏️ Sprawdź się – 1.7
> a) $\lim\limits_{x\to0}(1 + 5x)^{1/x}$ b) $\lim\limits_{x\to0}(1 - 2x)^{3/x}$ c) $\lim\limits_{x\to\infty}\left(\dfrac{x + 3}{x + 1}\right)^x$
>
> > [!success]- Rozwiązanie
> > a) $[1^\infty]$. Wzór $(1 + ax)^{1/x} \to e^a$ z $a = 5$: wynik $e^5$.
> > b) $[1^\infty]$. $(1 - 2x)^{3/x} = \left[(1 - 2x)^{1/x}\right]^3 \to \left(e^{-2}\right)^3 = e^{-6}$.
> > c) $[1^\infty]$. $\frac{x + 3}{x + 1} = 1 + \frac{2}{x + 1}$. Dopasowuję wykładnik:
> > $$\left(1 + \frac{2}{x + 1}\right)^x = \left[\left(1 + \frac{2}{x + 1}\right)^{\frac{x + 1}{2}}\right]^{\frac{2x}{x + 1}} \to e^2$$
> > bo nawias $\to e$, a $\frac{2x}{x + 1} \to 2$. Sprawdzenie skrótem: $(p - 1)\cdot x = \frac{2x}{x + 1} \to 2$ ✓.

##### 1.8 Kiedy granica nie istnieje

Dwa sposoby, żeby to **udowodnić**:

1. **Granice jednostronne są różne.** Przykład: $\frac{\lvert x\rvert}{x}$ w zerze. Dla $x > 0$ to $\frac{x}{x} = 1$, dla $x < 0$ to $\frac{-x}{x} = -1$. Z prawej $1$, z lewej $-1$, więc granicy nie ma.
2. **Dwa ciągi (definicja Heinego).** Znajdź dwa ciągi $a_n \to a$ i $b_n \to a$, dla których $f(a_n)$ i $f(b_n)$ dążą do **różnych** liczb. Przydaje się, gdy funkcja „wariuje” po obu stronach, np. $\sin\frac1x$ albo $\cos\frac{2}{x^2}$ przy zerze.

![[AM_W1_jednostronne.svg|560]]

> [!example] Sposób 2: $\lim\limits_{x\to\infty}\sin\sqrt{x}$ (Z03 dodatkowe 5b)
> - $a_n = (n\pi)^2 \to \infty$: $\ \sin\sqrt{a_n} = \sin(n\pi) = 0 \to 0$
> - $b_n = \left(\frac{\pi}{2} + 2n\pi\right)^2 \to \infty$: $\ \sin\sqrt{b_n} = \sin\left(\frac{\pi}{2} + 2n\pi\right) = 1 \to 1$
>
> $0 \ne 1$, więc granica nie istnieje. **Jak dobrać ciągi:** wybierz $x$, dla których to, co w środku, trafia w „ładne” kąty z różnymi wartościami.

> [!question] ✏️ Sprawdź się – 1.8
> Wykaż, że granica nie istnieje:
> a) $\lim\limits_{x\to2}\dfrac{\lvert x - 2\rvert}{x - 2}$ b) $\lim\limits_{x\to-2}\operatorname{arctg}\dfrac{1}{x + 2}$ c) $\lim\limits_{x\to0}\cos\dfrac1x$ (sposób dwóch ciągów)
>
> > [!success]- Rozwiązanie
> > a) Dla $x > 2$: $\frac{x - 2}{x - 2} = 1$, dla $x < 2$: $\frac{-(x - 2)}{x - 2} = -1$. Z prawej $1$, z lewej $-1$, różne, więc granica nie istnieje.
> > b) $x \to -2^+$: $\frac{1}{x + 2} \to +\infty$, więc $\operatorname{arctg} \to \frac{\pi}{2}$. $\ x \to -2^-$: $\frac{1}{x + 2} \to -\infty$, więc $\operatorname{arctg} \to -\frac{\pi}{2}$. Różne, granica nie istnieje.
> > c) $a_n = \frac{1}{2n\pi} \to 0$: $\ \cos\frac{1}{a_n} = \cos(2n\pi) = 1 \to 1$.
> > $b_n = \frac{1}{\pi + 2n\pi} \to 0$: $\ \cos\frac{1}{b_n} = \cos(\pi + 2n\pi) = -1 \to -1$.
> > $1 \ne -1$, więc granica nie istnieje.

##### 1.9 Twierdzenie o trzech funkcjach

Dokładnie jak [[1_Analiza_Matematyczna#8. Twierdzenie o trzech ciągach (dwóch policjantów)|trzy ciągi z W1]]: jeśli $g(x) \le f(x) \le h(x)$ blisko punktu i $g, h$ mają tę samą granicę $L$, to $f$ też.

> [!example] $\lim\limits_{x\to0} x\sin\frac1x$
> $\sin\frac1x$ wariuje, ale jest między $-1$ a $1$. Więc $-\lvert x\rvert \le x\sin\frac1x \le \lvert x\rvert$, oba końce $\to 0$. Wynik: $0$.
> Krócej: [ograniczony · coś $\to 0$] $= 0$, jak w [[1_Analiza_Matematyczna#6.6 Ograniczony razy coś dążącego do zera daje zero|W1, 6.6]].

> [!question] ✏️ Sprawdź się – 1.9
> a) $\lim\limits_{x\to0} x^2\cos\dfrac1x$ b) $\lim\limits_{x\to\infty}\dfrac{\sin x}{x}$ c) $\lim\limits_{x\to\infty}\dfrac{3x + \cos x}{x}$
>
> > [!success]- Rozwiązanie
> > a) $-1 \le \cos\frac1x \le 1$, więc $-x^2 \le x^2\cos\frac1x \le x^2$. Oba końce $\to 0$, wynik: $0$.
> > b) $-\frac1x \le \frac{\sin x}{x} \le \frac1x$ (dla $x > 0$). Oba końce $\to 0$, wynik: $0$. (Uwaga: to **nie** jest wzór $\frac{\sin x}{x} \to 1$, bo $x \to \infty$, a nie do $0$!)
> > c) $\frac{3x + \cos x}{x} = 3 + \frac{\cos x}{x}$. Jak w b): $-\frac1x \le \frac{\cos x}{x} \le \frac1x$, więc $\frac{\cos x}{x} \to 0$. Wynik: $3$.

> [!success] ➡️ Teraz zrób
> [[#Z03 Zadanie 1 – symbole z f i g|Z03: zadania 1–7]]. Potem wróć i czytaj rozdział 2.

---

#### 2. Ciągłość

##### 2.1 Definicja – trzy warunki

**Intuicja:** funkcja jest ciągła, gdy jej wykres da się narysować **bez odrywania ołówka**.

> [!important] Definicja
> Funkcja $f$ jest **ciągła w punkcie** $x_0$, gdy
> $$\lim_{x\to x_0} f(x) = f(x_0)$$
> Funkcja jest **ciągła**, gdy jest ciągła w każdym punkcie swojej dziedziny.

W praktyce sprawdzasz **trzy warunki** (lista z wykładu):
1. Czy $x_0$ **należy do dziedziny**, czyli czy $f(x_0)$ istnieje?
2. Czy **granica istnieje**, czyli czy $\lim\limits_{x\to x_0^-} f(x) = \lim\limits_{x\to x_0^+} f(x)$?
3. Czy ta granica **równa się** $f(x_0)$?

Każdy warunek może się „zepsuć” na swój sposób:

![[AM_W2_ciaglosc.svg|700]]

> [!question] ✏️ Sprawdź się – 2.1
> Czy funkcja jest ciągła we wskazanym punkcie? Jeśli nie, który z trzech warunków się psuje?
> a) $f(x) = \dfrac{x^2 - 1}{x - 1}$ dla $x \ne 1$, $\ f(1) = 2$; punkt $x_0 = 1$
> b) ta sama funkcja, ale $f(1) = 3$
> c) $f(x) = x + 1$ dla $x < 0$, $\ f(x) = x - 1$ dla $x \ge 0$; punkt $x_0 = 0$
>
> > [!success]- Rozwiązanie
> > a) 1. $f(1) = 2$ ✓. 2. $\frac{(x - 1)(x + 1)}{x - 1} = x + 1 \to 2$ ✓. 3. $2 = f(1)$ ✓. **Ciągła.**
> > b) Warunki 1 i 2 jak wyżej, ale $2 \ne 3 = f(1)$. Psuje się **warunek 3**: nieciągła.
> > c) 1. $f(0) = -1$ ✓. 2. Z lewej $x + 1 \to 1$, z prawej $x - 1 \to -1$. Różne, więc psuje się **warunek 2** (skok): nieciągła.

##### 2.2 Co jest ciągłe automatycznie

> [!important] Twierdzenia z wykładu
> - **Funkcje elementarne** (klocki z [[0_Analiza_Matematyczna|W0]] i wszystko z nich zbudowane) **są ciągłe w swoich dziedzinach**. Dlatego przy granicy w punkcie dziedziny wystarczy **wstawić**.
> - Jeśli $f$ i $g$ są ciągłe w $x_0$, to ciągłe są też $f \pm g$, $\ f\cdot g$, $\ \frac fg$ (o ile $g(x_0) \ne 0$).
> - **Złożenie** funkcji ciągłych jest ciągłe.

**Wniosek do zadań:** nieciągłość może się pojawić tylko w „podejrzanych” punktach:
- w punktach **sklejenia** funkcji zadanej kilkoma wzorami („klamerką”),
- tam, gdzie pojawia się „ręcznie” ustalona wartość, np. $f(0) = 2$ przy $\frac{\sin x}{x}$.

> [!example] Z03 8a: $f(x) = \frac{\sin x}{x}$ dla $x \ne 0$, $\ f(0) = 2$
> Dla $x \ne 0$ funkcja jest elementarna, więc ciągła. Podejrzany jest tylko $x_0 = 0$.
> 1. $f(0) = 2$ istnieje ✓
> 2. $\lim\limits_{x\to0}\frac{\sin x}{x} = 1$ istnieje ✓
> 3. $1 \ne 2 = f(0)$ ✗
>
> **Nieciągła** w zerze (przypadek 2 z rysunku: punkt „obok”). Gdyby ustalić $f(0) = 1$, byłaby ciągła.

> [!question] ✏️ Sprawdź się – 2.2
> Zbadaj ciągłość (gdzie są punkty „podejrzane”?):
> a) $f(x) = e^{x^2} + \cos x$
> b) $f(x) = \dfrac{\sin 3x}{x}$ dla $x \ne 0$, $\ f(0) = 3$
> c) $f(x) = \dfrac{e^x - 1}{x}$ dla $x \ne 0$, $\ f(0) = 0$
>
> > [!success]- Rozwiązanie
> > a) Funkcja elementarna (suma i złożenie klocków), dziedzina $\mathbb{R}$, więc **ciągła wszędzie**. Nie ma punktów podejrzanych.
> > b) Dla $x \ne 0$ elementarna, więc ciągła. Podejrzany $x_0 = 0$: $\ \frac{\sin 3x}{x} = 3\cdot\frac{\sin 3x}{3x} \to 3 = f(0)$ ✓. **Ciągła wszędzie.**
> > c) Dla $x \ne 0$ ciągła. W $x_0 = 0$: $\ \frac{e^x - 1}{x} \to 1$ (bonus z 1.5), a $f(0) = 0$. $1 \ne 0$, więc **nieciągła w zerze** (ciągła w pozostałych punktach).

##### 2.3 Funkcje sklejane i parametry

Typowe zadanie: dobierz $a$ (i $b$), żeby funkcja „z klamerką” była ciągła.

> [!tip] Przepis
> 1. Każdy kawałek osobno jest elementarny, więc ciągły. Podejrzane są tylko **punkty sklejenia**.
> 2. W każdym punkcie sklejenia policz: **granicę z lewej** (wzór z lewej części), **granicę z prawej** (wzór z prawej części) i **wartość** (ze wzoru, przy którym jest „$\le$” albo „$\ge$”).
> 3. **Przyrównaj wszystkie trzy** i rozwiąż równanie albo układ równań.

> [!example] Z03 9: $f(x) = a\dfrac{\sin(x-2)}{x-2}$ dla $x < 2$, $\ f(x) = \operatorname{arctg}\frac x2$ dla $x \ge 2$
> Punkt sklejenia: $x_0 = 2$.
> - Wartość: $f(2) = \operatorname{arctg} 1 = \frac{\pi}{4}$ (bo dla $x = 2$ obowiązuje dolny wzór).
> - Z prawej: $\operatorname{arctg}\frac x2 \to \operatorname{arctg} 1 = \frac{\pi}{4}$.
> - Z lewej: $a\cdot\frac{\sin(x-2)}{x-2} \to a\cdot 1 = a$ (typ $\frac{\sin t}{t}$ z $t = x - 2 \to 0$).
>
> Ciągłość: $a = \frac{\pi}{4}$.

> [!example] 🌍 Z życia: ciągłe i nieciągłe zależności
> - **Ciągłe:** temperatura w ciągu dnia, poziom paliwa w baku, pozycja samochodu. Fizyka nie pozwala na „teleportację”.
> - **Nieciągłe (skokowe):** cena przesyłki zależna od wagi (do 1 kg jedna cena, powyżej wyższa), opłata za parkowanie liczona za rozpoczętą godzinę, ocena z kolokwium w zależności od punktów (49 pkt → 2, 50 pkt → 3).
> - W programowaniu `if` tworzy funkcję sklejaną. Zadanie 2.3 to pytanie: czy przy granicznym warunku obie gałęzie dają ten sam wynik? Jeśli nie, masz „skok”, a często też buga.

> [!question] ✏️ Sprawdź się – 2.3
> Dobierz parametry tak, żeby funkcja była ciągła:
> a) $f(x) = ax + 1$ dla $x < 2$, $\ f(x) = x^2 - 1$ dla $x \ge 2$
> b) $f(x) = \dfrac{\sin(ax)}{x}$ dla $x < 0$, $\ f(x) = x + 5$ dla $x \ge 0$
> c) $f(x) = 2x + a$ dla $x < 0$, $\ f(x) = x^2 + b$ dla $0 \le x < 1$, $\ f(x) = 4x$ dla $x \ge 1$
>
> > [!success]- Rozwiązanie
> > a) Punkt sklejenia $2$. Z lewej: $2a + 1$. Z prawej i wartość: $4 - 1 = 3$. $\ 2a + 1 = 3$, więc $a = 1$.
> > b) Punkt sklejenia $0$. Z prawej i wartość: $f(0) = 5$. Z lewej (dla $a \ne 0$): $\frac{\sin(ax)}{x} = a\cdot\frac{\sin(ax)}{ax} \to a$. Więc $a = 5$. (Dla $a = 0$ lewy wzór to $0$, a $0 \ne 5$.)
> > c) W $x = 0$: z lewej $a$, z prawej i wartość $b$, więc $a = b$. W $x = 1$: z lewej $1 + b$, z prawej i wartość $4$, więc $b = 3$. Odpowiedź: $a = b = 3$.

##### 2.4 Własność Darboux

> [!important] Twierdzenie (Darboux, o wartości pośredniej)
> Jeśli $f$ jest **ciągła** na przedziale $[a, b]$ i $f(a)\cdot f(b) < 0$ (na końcach różne znaki), to istnieje $c \in (a, b)$, takie że $f(c) = 0$.
>
> Po ludzku: żeby przejść z ujemnych na dodatnie bez odrywania ołówka, **trzeba** przeciąć oś.

> [!example] Z03 dodatkowe 6: $x^5 - 3x = 1$ ma pierwiastek w $(1, 2)$
> $f(x) = x^5 - 3x - 1$ jest ciągła (wielomian). $f(1) = 1 - 3 - 1 = -3 < 0$, $\ f(2) = 32 - 6 - 1 = 25 > 0$. Na mocy Darboux istnieje pierwiastek w $(1, 2)$.

> [!example] 🌍 Z życia: bisekcja, czyli jak komputer rozwiązuje równania
> Darboux to przepis na algorytm. Wiem, że pierwiastek jest w $(1, 2)$. Sprawdzam środek: $f(1{,}5) \approx 2{,}09 > 0$, więc pierwiastek jest w $(1;\ 1{,}5)$. Środek: $f(1{,}25) \approx -1{,}70 < 0$, więc jest w $(1{,}25;\ 1{,}5)$. I tak dalej. Każdy krok **połowi** przedział, więc po 10 krokach znam wynik z dokładnością do $0{,}001$ (pierwiastek $\approx 1{,}389$).
> To ten sam pomysł co **wyszukiwanie binarne** (binary search) z ASD, a `git bisect` w ten sam sposób szuka commita, który wprowadził błąd.
>
> Druga wersja na co dzień: wchodzisz na górę i o 8:00 jesteś na 500 m n.p.m., a o 12:00 na 1500 m. **Na pewno** w którymś momencie byłeś dokładnie na 1000 m.

> [!question] ✏️ Sprawdź się – 2.4
> a) Wykaż, że równanie $x^3 + x - 1 = 0$ ma pierwiastek w przedziale $(0, 1)$.
> b) Zrób jeden krok bisekcji dla a): w której połowie leży pierwiastek?
> c) Wykaż, że równanie $e^x = 3 - x$ ma rozwiązanie w $(0, 1)$.
> d) Dla $f(x) = \frac1x$ mamy $f(-1) = -1 < 0$ i $f(1) = 1 > 0$, a jednak $f$ nigdzie nie ma zera. Dlaczego to nie przeczy twierdzeniu Darboux?
>
> > [!success]- Rozwiązanie
> > a) $f(x) = x^3 + x - 1$ jest ciągła (wielomian). $f(0) = -1 < 0$, $\ f(1) = 1 > 0$. Z Darboux istnieje $c \in (0, 1)$, że $f(c) = 0$.
> > b) Środek: $f(0{,}5) = 0{,}125 + 0{,}5 - 1 = -0{,}375 < 0$. Znak zmienia się między $0{,}5$ a $1$, więc pierwiastek jest w $(0{,}5;\ 1)$.
> > c) Przenoszę wszystko na jedną stronę: $f(x) = e^x + x - 3$, ciągła. $f(0) = 1 - 3 = -2 < 0$, $\ f(1) = e - 2 \approx 0{,}72 > 0$. Z Darboux jest rozwiązanie w $(0, 1)$.
> > d) $\frac1x$ **nie jest ciągła na $[-1, 1]$** (w $0$ nie jest nawet określona, wykres „przeskakuje” z $-\infty$ na $+\infty$). Założenie twierdzenia nie jest spełnione.

> [!success] ➡️ Teraz zrób
> [[#Z03 Zadanie 8 – czy ciągła|Z03: zadania 8–10]]. Potem wróć i czytaj rozdział 3.

---

#### 3. Asymptoty

**Asymptota** to prosta, do której wykres zbliża się coraz bardziej. Z wykładu: *aby wyznaczyć asymptoty, liczymy granice funkcji na krańcach dziedziny*.

![[AM_W2_asymptoty.svg|700]]

##### 3.1 Pionowe

> [!important] Definicja
> Prosta $x = a$ jest **asymptotą pionową** (lewostronną / prawostronną), gdy
> $$\lim_{x\to a^-} f(x) = \pm\infty \quad\text{lub}\quad \lim_{x\to a^+} f(x) = \pm\infty$$
> Jeśli zachodzi z obu stron, to asymptota **obustronna**.

**Gdzie szukać:** w punktach, których **brakuje w dziedzinie** (zero w mianowniku, brzeg dziedziny logarytmu). Typowo wychodzi $\left[\frac{c}{0}\right]$.

> [!warning] Dziura w dziedzinie to nie zawsze asymptota
> $\frac{x^2 - 4}{x - 2} = x + 2$ dla $x \ne 2$. W $x = 2$ jest dziura, ale granica wynosi $4$ (skończona), więc **asymptoty brak**. Asymptota pionowa wymaga $\pm\infty$.

> [!question] ✏️ Sprawdź się – 3.1
> Znajdź asymptoty pionowe (z której strony?):
> a) $f(x) = \dfrac{x + 2}{x - 3}$ b) $f(x) = \dfrac{x^2 - 9}{x + 3}$ c) $f(x) = \ln(x - 1)$
>
> > [!success]- Rozwiązanie
> > a) Brak w dziedzinie: $x = 3$. $\left[\frac{5}{0}\right]$: z prawej $\left[\frac{5}{0^+}\right] = +\infty$, z lewej $\left[\frac{5}{0^-}\right] = -\infty$. Asymptota $x = 3$ **obustronna**.
> > b) Brak w dziedzinie: $x = -3$. Ale $\left[\frac00\right]$: $\frac{(x - 3)(x + 3)}{x + 3} = x - 3 \to -6$. Granica skończona, więc **brak** asymptoty pionowej (tylko dziura).
> > c) Dziedzina: $x > 1$. Przy $x \to 1^+$: $x - 1 \to 0^+$, więc $\ln(x - 1) \to -\infty$. Asymptota $x = 1$ **prawostronna** (z lewej nie ma dziedziny).

##### 3.2 Poziome

> [!important] Definicja
> Prosta $y = B$ jest **asymptotą poziomą** w $+\infty$ (w $-\infty$), gdy $\lim\limits_{x\to+\infty} f(x) = B$ (odpowiednio $x \to -\infty$), gdzie $B$ to **liczba**.

W $+\infty$ i $-\infty$ mogą być **różne** asymptoty, np. $\operatorname{arctg} x$: $y = \frac{\pi}{2}$ w $+\infty$ i $y = -\frac{\pi}{2}$ w $-\infty$.

> [!question] ✏️ Sprawdź się – 3.2
> Znajdź asymptoty poziome (osobno w $+\infty$ i $-\infty$):
> a) $f(x) = \dfrac{4x^2 - x}{2x^2 + 3}$ b) $f(x) = 3^x + 1$ c) $f(x) = 2\operatorname{arctg} x$
>
> > [!success]- Rozwiązanie
> > a) Dzielę przez $x^2$: $\frac{4 - \frac1x}{2 + \frac{3}{x^2}} \to 2$ w obu nieskończonościach. Asymptota $y = 2$ w $\pm\infty$.
> > b) $x \to -\infty$: $3^x \to 0$, więc $f \to 1$: asymptota $y = 1$ w $-\infty$. $\ x \to +\infty$: $3^x \to \infty$, brak asymptoty poziomej.
> > c) $x \to +\infty$: $2\cdot\frac{\pi}{2} = \pi$; $\ x \to -\infty$: $2\cdot\left(-\frac{\pi}{2}\right) = -\pi$. Asymptoty: $y = \pi$ w $+\infty$, $\ y = -\pi$ w $-\infty$.

##### 3.3 Ukośne

> [!important] Asymptota ukośna $y = mx + k$ (dodatek z kartki Z03)
> $$m = \lim_{x\to\pm\infty}\frac{f(x)}{x}, \qquad k = \lim_{x\to\pm\infty}\big[f(x) - mx\big]$$
> Obie granice muszą istnieć i być **skończone**. Jeśli $m = 0$, to wychodzi asymptota pozioma $y = k$, więc ten wzór załatwia oba przypadki naraz.

**Skąd wzory:** jeśli $f(x) \approx mx + k$ dla dużych $x$, to $\frac{f(x)}{x} \approx m + \frac kx \to m$. Potem odejmujesz $mx$ i zostaje $k$.

> [!example] $f(x) = \dfrac{x^2}{x-1}$ (prawy rysunek wyżej)
> $m = \lim\dfrac{x^2}{x(x-1)} = \lim\dfrac{x^2}{x^2 - x} = 1$
> $k = \lim\left(\dfrac{x^2}{x-1} - x\right) = \lim\dfrac{x^2 - x^2 + x}{x-1} = \lim\dfrac{x}{x-1} = 1$
> Asymptota ukośna: $y = x + 1$ (w obu nieskończonościach).

> [!tip] Skrót dla funkcji wymiernych $\frac{\text{wielomian}}{\text{wielomian}}$
> | Stopnie | Asymptota w $\pm\infty$ |
> |---|---|
> | licznik < mianownik | pozioma $y = 0$ |
> | licznik = mianownik | pozioma $y = \frac{\text{liczba przy szefie licznika}}{\text{liczba przy szefie mianownika}}$ |
> | licznik = mianownik + 1 | **ukośna** (licz $m$ i $k$) |
> | licznik ≥ mianownik + 2 | brak (rośnie szybciej niż prosta) |

> [!question] ✏️ Sprawdź się – 3.3
> a) Asymptota ukośna $f(x) = \dfrac{x^2 + 5x}{x + 1}$
> b) Asymptota ukośna $f(x) = \dfrac{2x^3 + x}{x^2 + 1}$
> c) Bez liczenia (skrót ze stopni): jaka asymptota w $\pm\infty$? $\ \text{(i) } \dfrac{x^4 + 1}{x^2 + 5}$, $\ \text{(ii) } \dfrac{5x - 1}{x^3 + 2}$, $\ \text{(iii) } \dfrac{3x^2 + 1}{6x^2 - x}$
>
> > [!success]- Rozwiązanie
> > a) $m = \lim\dfrac{x^2 + 5x}{x(x + 1)} = \lim\dfrac{x^2 + 5x}{x^2 + x} = 1$.
> > $k = \lim\left(\dfrac{x^2 + 5x}{x + 1} - x\right) = \lim\dfrac{x^2 + 5x - x^2 - x}{x + 1} = \lim\dfrac{4x}{x + 1} = 4$. Asymptota $y = x + 4$ w $\pm\infty$.
> > b) $m = \lim\dfrac{2x^3 + x}{x^3 + x} = 2$. $\ k = \lim\left(\dfrac{2x^3 + x}{x^2 + 1} - 2x\right) = \lim\dfrac{2x^3 + x - 2x^3 - 2x}{x^2 + 1} = \lim\dfrac{-x}{x^2 + 1} = 0$. Asymptota $y = 2x$ w $\pm\infty$.
> > c) (i) stopień licznika $4 \ge 2 + 2$: **brak**. (ii) licznik < mianownik: $y = 0$. (iii) stopnie równe: $y = \frac36 = \frac12$.

##### 3.4 Przepis na wszystkie asymptoty

> [!tip] 4 kroki
> 1. **Dziedzina.** Wypisz jej „krańce”: punkty wyrzucone z dziedziny, brzegi przedziałów, $\pm\infty$.
> 2. **Pionowe:** w każdym skończonym krańcu policz granice **jednostronne** (tylko z tej strony, z której jest dziedzina). Wynik $\pm\infty$ oznacza asymptotę.
> 3. **Poziome/ukośne:** w $+\infty$ i osobno w $-\infty$ policz $m$ i $k$ (albo od razu $\lim f$; skończona granica to pozioma).
> 4. **Zapisz odpowiedź** z informacją, z której strony: „$x = 1$ obustronna, $y = 0$ w $\pm\infty$”.

> [!example] 🌍 Z życia: asymptoty w informatyce
> **Pozioma: prawo Amdahla.** Program ma 10% kodu, którego nie da się zrównoleglić. Przyspieszenie na $n$ rdzeniach: $S(n) = \dfrac{1}{0{,}1 + \frac{0{,}9}{n}}$.
>
> | rdzenie $n$ | $10$ | $100$ | $1000$ | $\infty$ |
> |---|---|---|---|---|
> | przyspieszenie | $5{,}3\times$ | $9{,}2\times$ | $9{,}9\times$ | $\mathbf{10\times}$ |
>
> Asymptota $y = 10$: **żadna** liczba procesorów nie przyspieszy tego programu więcej niż 10 razy.
>
> **Pionowa: obciążenie serwera.** Średni czas obsługi żądania rośnie jak $\dfrac{1}{1 - \rho}$, gdzie $\rho$ to obciążenie (0 = bezczynny, 1 = 100%). Przy 50% obciążenia czekasz $2\times$ dłużej niż na pustym serwerze, przy 90% $10\times$, przy 99% $100\times$. Asymptota $\rho = 1$: dlatego admini alarmują już przy 80%, a nie przy 100%.
>
> **Pozioma w życiu:** ładowanie baterii zwalnia przy 100%, a herbata stygnie do temperatury pokoju.

> [!question] ✏️ Sprawdź się – 3.4
> Wyznacz wszystkie asymptoty:
> a) $f(x) = \dfrac{x^2 + 3}{x - 2}$ b) $f(x) = \dfrac{x}{\sqrt{x^2 + 1}}$ c) $f(x) = e^{1/x}$
>
> > [!success]- Rozwiązanie
> > a) Dziedzina $x \ne 2$. Pionowa: $\left[\frac{7}{0}\right]$, z prawej $+\infty$, z lewej $-\infty$, więc $x = 2$ obustronna. Ukośna: $m = \lim\frac{x^2 + 3}{x^2 - 2x} = 1$, $\ k = \lim\left(\frac{x^2 + 3}{x - 2} - x\right) = \lim\frac{2x + 3}{x - 2} = 2$. Asymptota $y = x + 2$ w $\pm\infty$.
> > b) Dziedzina $\mathbb{R}$ ($x^2 + 1 > 0$), więc pionowych brak. $x \to +\infty$: $\frac{x}{x\sqrt{1 + 1/x^2}} \to 1$. $\ x \to -\infty$: $\sqrt{x^2 + 1} = -x\sqrt{1 + 1/x^2}$, więc $\frac{x}{-x\sqrt{\ldots}} \to -1$. Asymptoty: $y = 1$ w $+\infty$, $\ y = -1$ w $-\infty$.
> > c) Dziedzina $x \ne 0$. $x \to 0^+$: $\frac1x \to +\infty$, $e^{+\infty} = +\infty$, więc $x = 0$ **prawostronna**. $x \to 0^-$: $\frac1x \to -\infty$, $e^{-\infty} = 0$ (z lewej asymptoty brak). W $\pm\infty$: $\frac1x \to 0$, $e^0 = 1$, więc $y = 1$ w $\pm\infty$.

> [!success] ➡️ Teraz zrób
> [[#Z03 Zadanie 11 – dopasuj wykres|Z03: zadania 11–12]]. Potem wróć i czytaj rozdział 4.

---

#### 4. Pochodna – definicja

> [!abstract] Na chłopski rozum
> Prosta $y = mx + b$ ma wszędzie to samo nachylenie $m$: o tyle rośnie $y$, gdy $x$ wzrośnie o 1. Wykres funkcji jest krzywy, więc nachylenie **zmienia się z miejsca na miejsce**.
> **Pochodna $f'(a)$ to nachylenie wykresu w punkcie $a$**: nachylenie prostej, która „dotyka” wykresu w tym miejscu (stycznej).
> - $f'(a) > 0$: wykres idzie **w górę**; im większa liczba, tym stromiej.
> - $f'(a) < 0$: wykres idzie **w dół**.
> - $f'(a) = 0$: płasko (szczyt, dołek albo „półka”).

![[AM_W2_nachylenie.svg|700]]

##### 4.1 Od siecznej do stycznej

Styczną do okręgu łatwo zdefiniować („jeden punkt wspólny”), ale do dowolnej krzywej już nie: styczna może przecinać wykres w innym miejscu albo przechodzić na drugą stronę (rysunki na str. 7–8 wykładu). Dlatego stosuje się **podejście dynamiczne**:
1. Weź punkt $P$ na wykresie i drugi punkt $Q$ obok. Narysuj prostą $PQ$ (**sieczną**).
2. Przesuwaj $Q$ coraz bliżej $P$. Sieczne obracają się i dążą do **stycznej**.

![[AM_W2_sieczne_styczna.svg|700]]

Nachylenie siecznej $PQ$, gdy $P = (a, f(a))$ i $Q = (x, f(x))$, to „przyrost w pionie przez przyrost w poziomie”:
$$m_Q = \frac{f(x) - f(a)}{x - a} = \frac{\Delta f}{\Delta x}$$

> [!question] ✏️ Sprawdź się – 4.1
> $f(x) = 2x^2$, punkt $P = (1, 2)$. Policz nachylenie siecznej $PQ$, gdy $Q$ ma pierwszą współrzędną: a) $x = 2$ b) $x = 1{,}1$ c) $x = 1{,}01$. Do jakiej liczby to dąży i co ta liczba oznacza?
>
> > [!success]- Rozwiązanie
> > $m_Q = \frac{f(x) - f(1)}{x - 1} = \frac{2x^2 - 2}{x - 1}$:
> > a) $\frac{8 - 2}{1} = 6$ b) $\frac{2{,}42 - 2}{0{,}1} = 4{,}2$ c) $\frac{2{,}0402 - 2}{0{,}01} = 4{,}02$
> > Nachylenia dążą do $4$. To nachylenie **stycznej** do wykresu w punkcie $P$, czyli $f'(1) = 4$.

##### 4.2 Definicja i oznaczenia

> [!important] Definicja pochodnej
> $$f'(a) = \lim_{x\to a}\frac{f(x) - f(a)}{x - a} = \lim_{\Delta x\to0}\frac{\Delta f}{\Delta x}$$
> - $\Delta x = x - a$: **przyrost argumentu**, $\ \Delta f = f(x) - f(a)$: **przyrost funkcji**.
> - Typ granicy to zawsze $\left[\frac00\right]$ (gdy $x \to a$, oba przyrosty $\to 0$). To ten „$\frac00$” z [[1_Analiza_Matematyczna#10. Granica funkcji (zapowiedź Z03)|W1]].
> - Jeśli granica wynosi $\pm\infty$, mówimy o **pochodnej niewłaściwej** (styczna pionowa).

**Oznaczenia:** $f'(a) = \dfrac{df}{dx}(a) = \dfrac{d}{dx}f = Df(a)$. **Różniczkować** to liczyć pochodną. Funkcja **różniczkowalna** ma pochodną w każdym punkcie dziedziny.

> [!tip] Rozpoznawanie definicji (Z04 zadanie 0)
> Jeśli widzisz $\lim\limits_{x\to a}\frac{f(x) - f(a)}{x - a}$, to **jest** $f'(a)$, nic nie licz!
> $\lim\limits_{x\to\pi/7}\dfrac{\sin x - \sin\frac{\pi}{7}}{x - \frac{\pi}{7}} = (\sin x)'\big|_{x=\pi/7} = \cos\frac{\pi}{7}$

> [!question] ✏️ Sprawdź się – 4.2
> Rozpoznaj definicję pochodnej i podaj wynik bez liczenia granicy (pochodne z tablicy, rozdz. 6):
> a) $\lim\limits_{x\to\pi/3}\dfrac{\cos x - \frac12}{x - \frac{\pi}{3}}$ b) $\lim\limits_{x\to1}\dfrac{\ln x}{x - 1}$ c) $\lim\limits_{\Delta x\to0}\dfrac{(2 + \Delta x)^4 - 16}{\Delta x}$
>
> > [!success]- Rozwiązanie
> > a) $\frac12 = \cos\frac{\pi}{3}$, więc to $f'\left(\frac{\pi}{3}\right)$ dla $f = \cos x$: $\ -\sin\frac{\pi}{3} = -\frac{\sqrt3}{2}$.
> > b) $\ln 1 = 0$, więc $\frac{\ln x - \ln 1}{x - 1}$ to $f'(1)$ dla $f = \ln x$: $\ \frac11 = 1$.
> > c) $16 = 2^4$ i $x = 2 + \Delta x$, więc to $f'(2)$ dla $f = x^4$: $\ 4\cdot 2^3 = 32$.

##### 4.3 Pochodna z definicji

> [!example] Przykład z wykładu: $f(x) = x^2$
> **W punkcie $a = 2$:**
> $$f'(2) = \lim_{x\to2}\frac{x^2 - 2^2}{x - 2} = \lim_{x\to2}\frac{(x-2)(x+2)}{x-2} = \lim_{x\to2}(x + 2) = 4$$
> Styczna do paraboli w punkcie $(2, 4)$ ma nachylenie $4$.
>
> **W dowolnym punkcie $a$:** identycznie, $\frac{x^2 - a^2}{x - a} = x + a \to 2a$. Więc $f'(a) = 2a$, czyli po zamianie nazwy $(x^2)' = 2x$.
>
> **Morał:** pochodna to **nowa funkcja**: w każdym punkcie podaje nachylenie. Dla $x^2$: w $x = 0$ płasko ($0$), w $x = 1$ nachylenie $2$, w $x = 3$ już $6$.

Na szczęście nie trzeba tak liczyć za każdym razem. Raz policzone pochodne podstawowych funkcji trafiają do **tabeli** (rozdz. 6), a reguły (rozdz. 7) pozwalają składać z nich resztę.

> [!question] ✏️ Sprawdź się – 4.3
> Policz z definicji:
> a) $f(x) = 3x^2$ w punkcie $a = 1$ b) $f(x) = \dfrac1x$ w punkcie $a = 2$ c) $f(x) = x^2 + 5x$ w dowolnym punkcie $a$
>
> > [!success]- Rozwiązanie
> > a) $\lim\limits_{x\to1}\dfrac{3x^2 - 3}{x - 1}\left[\frac00\right] = \lim\limits_{x\to1}\dfrac{3(x - 1)(x + 1)}{x - 1} = \lim\limits_{x\to1} 3(x + 1) = 6$
> > b) $\dfrac{\frac1x - \frac12}{x - 2} = \dfrac{\frac{2 - x}{2x}}{x - 2} = \dfrac{-(x - 2)}{2x(x - 2)} = -\dfrac{1}{2x} \to -\dfrac14$
> > c) $\dfrac{x^2 + 5x - a^2 - 5a}{x - a} = \dfrac{(x - a)(x + a) + 5(x - a)}{x - a} = x + a + 5 \to 2a + 5$. Czyli $f'(x) = 2x + 5$.

##### 4.4 Interpretacja fizyczna – prędkość

Samochód (albo spadający kamień) przebył drogę $y = f(t)$ w czasie $t$. **Prędkość średnia** od chwili $t_0$ do $t$ to $\frac{\text{droga}}{\text{czas}} = \frac{f(t) - f(t_0)}{t - t_0}$. Skracając odcinek czasu, dostajesz **prędkość chwilową**:
$$v(t_0) = \lim_{t\to t_0}\frac{f(t) - f(t_0)}{t - t_0} = f'(t_0)$$

Tabela z wykładu to swobodny spadek $f(t) = 16t^2$ (w stopach; w metrach byłoby $4{,}9t^2$):

| $\Delta t$ | prędkość średnia od $t_0 = 1$ | od $t_0 = 2$ |
|---|---|---|
| $1$ | $48$ | $80$ |
| $0{,}1$ | $33{,}6$ | $65{,}6$ |
| $0{,}01$ | $32{,}16$ | $64{,}16$ |
| $0{,}001$ | $32{,}016$ | $64{,}016$ |
| **granica** | $\mathbf{32} = f'(1)$ | $\mathbf{64} = f'(2)$ |

(W PDF wykładu w kolumnie $t_0 = 1$ są literówki: dla $\Delta t = 0{,}1$ i $0{,}01$ powinno być $33{,}6$ i $32{,}16$.) Sprawdzenie: $f'(t) = 32t$, więc $f'(1) = 32$ i $f'(2) = 64$ ✓.

> [!example] 🌍 Z życia: pochodna to „tempo zmian”
> | Wielkość | Jej pochodna |
> |---|---|
> | położenie | **prędkość** (prędkościomierz pokazuje pochodną!) |
> | prędkość | **przyspieszenie** (druga pochodna położenia, rozdz. 9) |
> | liczba użytkowników aplikacji | ilu przybywa dziennie |
> | koszt produkcji $n$ sztuk | koszt **jednej dodatkowej** sztuki (ekonomiści: „koszt krańcowy”) |
> | błąd modelu AI w zależności od wag | **gradient**, czyli w którą stronę zmienić wagi, żeby błąd malał |
>
> Gdy w wiadomościach mówią „inflacja spada”, a ceny dalej rosną, chodzi o to, że **pochodna** cen jest nadal dodatnia (ceny rosną), tylko maleje (rosną wolniej).

> [!question] ✏️ Sprawdź się – 4.4
> a) Droga kamienia to $s(t) = 5t^2$ (metry, sekundy). Policz prędkość średnią od $t = 2$ do $t = 3$ i prędkość chwilową w $t = 2$ (z definicji).
> b) Samochód jedzie zgodnie ze wzorem $s(t) = 3t + 2$. Jaka jest jego prędkość chwilowa w dowolnej chwili?
> c) $T(t)$ to temperatura herbaty (°C) po $t$ minutach. Co oznacza $T'(5) = -2$?
>
> > [!success]- Rozwiązanie
> > a) Średnia: $\frac{s(3) - s(2)}{3 - 2} = \frac{45 - 20}{1} = 25$ m/s. Chwilowa: $\lim\limits_{t\to2}\frac{5t^2 - 20}{t - 2} = \lim\limits_{t\to2} 5(t + 2) = 20$ m/s.
> > b) $\frac{(3t + 2) - (3t_0 + 2)}{t - t_0} = \frac{3(t - t_0)}{t - t_0} = 3$. Prędkość stała, $3$ w każdej chwili (ruch jednostajny, wykres to prosta o nachyleniu $3$).
> > c) W 5. minucie herbata stygnie w tempie około **2 stopni na minutę** (minus: temperatura maleje).

> [!success] ➡️ Teraz zrób
> [[#Z04 Zadanie 0 – definicja pochodnej|Z04: zadanie 0]]. Potem wróć i czytaj rozdział 5.

---

#### 5. Gdzie pochodnej nie ma

Pochodna nie istnieje, gdy w punkcie nie da się wyznaczyć jednej, nie-pionowej stycznej:

![[AM_W2_brak_pochodnej.svg|700]]

| Przypadek | Przykład | Co się dzieje z siecznymi |
|---|---|---|
| **kąt** (ostrze) | $\lvert x\rvert$ w $0$ | z lewej dążą do nachylenia $-1$, z prawej do $+1$: dwie różne „styczne” |
| **szpic** (cusp) | $\sqrt[3]{x^2}$ w $0$ | z lewej $\to -\infty$, z prawej $\to +\infty$ |
| **pionowa styczna** | $\sqrt[3]{x}$ w $0$ | z obu stron $\to +\infty$: pochodna niewłaściwa |
| **nieciągłość** | skok, dziura | sieczne „przeskakują” w pion |

Pochodne z wykładu: $\left(\sqrt[3]{x}\right)' = \dfrac{1}{3\sqrt[3]{x^2}} \to \infty$ przy $x \to 0$, a $\left(\sqrt[3]{x^2}\right)' = \dfrac{2}{3\sqrt[3]{x}}$, czyli $-\infty$ z lewej i $+\infty$ z prawej. (W PDF na str. 17 jest „ma poziomą styczną” przy $\sqrt[3]x$; poprawnie: **pionową**.)

> [!important] Różniczkowalna ⇒ ciągła (ale nie odwrotnie!)
> Jeśli funkcja ma pochodną w punkcie, to jest w nim ciągła. **Odwrotnie nie:** $\lvert x\rvert$ jest ciągła w zerze, a pochodnej tam nie ma (kąt).

> [!question] ✏️ Sprawdź się – 5
> a) Czy $f(x) = \lvert x - 3\rvert$ ma pochodną w $x_0 = 3$? Policz ilorazy z lewej i z prawej.
> b) Co się dzieje z pochodną $f(x) = \sqrt[5]{x}$ w $x_0 = 0$?
> c) Czy $f(x) = x\lvert x\rvert$ ma pochodną w $x_0 = 0$?
> d) Prawda czy fałsz: „jeśli $f$ jest ciągła w $x_0$, to ma tam pochodną”?
>
> > [!success]- Rozwiązanie
> > a) $\frac{f(x) - f(3)}{x - 3} = \frac{\lvert x - 3\rvert}{x - 3}$: z prawej $1$, z lewej $-1$. Różne, więc pochodnej **nie ma** (kąt).
> > b) $\frac{\sqrt[5]{x} - 0}{x - 0} = \frac{x^{1/5}}{x} = x^{-4/5} = \frac{1}{\sqrt[5]{x^4}}$. Mianownik $\to 0^+$ z obu stron, więc iloraz $\to +\infty$: pochodna niewłaściwa, **pionowa styczna** (jak $\sqrt[3]{x}$).
> > c) $\frac{x\lvert x\rvert - 0}{x - 0} = \lvert x\rvert \to 0$ z obu stron. **Tak**, $f'(0) = 0$ (moduł nie zawsze psuje pochodną!).
> > d) **Fałsz.** Kontrprzykład: $\lvert x\rvert$ w zerze jest ciągła, ale pochodnej nie ma. Prawdziwe jest odwrotne: różniczkowalna ⇒ ciągła.

---

#### 6. Tablica pochodnych

> [!important] Pochodne podstawowych funkcji (wykład + kartka Z04)
> | $f(x)$ | $f'(x)$ | Uwagi |
> |---|---|---|
> | $C$ (stała) | $0$ | stała się nie zmienia, więc nachylenie $0$ |
> | $x^r$ | $r\,x^{r-1}$ | **dla każdego** $r$: całkowitego, ujemnego, ułamkowego |
> | $e^x$ | $e^x$ | jedyna (poza $0$) funkcja równa swojej pochodnej |
> | $a^x$ | $a^x\ln a$ | $a > 0$, $a \ne 1$ |
> | $\ln x$ | $\dfrac1x$ | |
> | $\log_a x$ | $\dfrac{1}{x\ln a}$ | $a > 0$, $a \ne 1$ (w PDF literówka „$a \ne 0$”) |
> | $\sin x$ | $\cos x$ | |
> | $\cos x$ | $-\sin x$ | **minus!** |
> | $\operatorname{tg} x$ | $\dfrac{1}{\cos^2 x}$ | |
> | $\arcsin x$ | $\dfrac{1}{\sqrt{1-x^2}}$ | |
> | $\arccos x$ | $\dfrac{-1}{\sqrt{1-x^2}}$ | |
> | $\operatorname{arctg} x$ | $\dfrac{1}{1+x^2}$ | |
> | $\operatorname{arcctg} x$ | $\dfrac{-1}{1+x^2}$ | |

> [!tip] Wzór na potęgę to 80% roboty: najpierw przepisz na $x^r$
> Pierwiastki i ułamki zamień na potęgi (prawa potęg z [[0_Analiza_Matematyczna#1. Potęgi i funkcja wykładnicza|W0, rozdz. 1]]), dopiero potem różniczkuj:
>
> | Funkcja | Jako potęga | Pochodna $r\,x^{r-1}$ |
> |---|---|---|
> | $\sqrt x$ | $x^{1/2}$ | $\frac12 x^{-1/2} = \dfrac{1}{2\sqrt x}$ |
> | $\dfrac1x$ | $x^{-1}$ | $-x^{-2} = -\dfrac{1}{x^2}$ |
> | $\dfrac{1}{\sqrt[3]{x}}$ | $x^{-1/3}$ | $-\frac13 x^{-4/3} = -\dfrac{1}{3\sqrt[3]{x^4}}$ |
> | $\sqrt[3]{x^4}$ | $x^{4/3}$ | $\frac43 x^{1/3} = \frac43\sqrt[3]{x}$ |
> | $\dfrac{x^4}{\sqrt[3]{x^8}}$ | $x^{4 - 8/3} = x^{4/3}$ | $\frac43\sqrt[3]{x}$ |
>
> **Przepis na wykładnik:** „zmniejsz o 1”. Uważaj przy ujemnych: $-\frac13 - 1 = -\frac43$, a nie $-\frac23$.

> [!warning] Pochodna „względem czego”?
> $f(y) = \dfrac{1}{x^3}$: zmienną jest $y$, a $x$ to tu **stała**. Pochodna względem $y$ wynosi więc $0$ (Z04 1i, pułapka). Zawsze patrz, **jaka litera jest w nawiasie** przy $f(\cdot)$.

> [!question] ✏️ Sprawdź się – 6
> Oblicz pochodne z tablicy (najpierw przepisz na potęgę, gdzie się da):
> a) $x^6$, $\ \dfrac{1}{x^3}$ b) $\sqrt[5]{x^2}$, $\ f(t) = t\sqrt t$ c) $5^x$, $\ \log_3 x$ d) $f(t) = a^2 t$ (pochodna względem $t$)
>
> > [!success]- Rozwiązanie
> > a) $(x^6)' = 6x^5$; $\ \frac{1}{x^3} = x^{-3}$, więc $-3x^{-4} = -\frac{3}{x^4}$.
> > b) $x^{2/5}$, więc $\frac25 x^{-3/5} = \frac{2}{5\sqrt[5]{x^3}}$ (bo $\frac25 - 1 = -\frac35$); $\ t\sqrt t = t^{3/2}$, więc $\frac32 t^{1/2} = \frac32\sqrt t$.
> > c) $(5^x)' = 5^x\ln 5$; $\ (\log_3 x)' = \frac{1}{x\ln 3}$.
> > d) Zmienną jest $t$, a $a^2$ to stała: $(a^2 t)' = a^2$.

> [!success] ➡️ Teraz zrób
> [[#Z04 Zadanie 1 – z tablic|Z04: zadanie 1]]. Potem wróć i czytaj rozdział 7.

---

#### 7. Reguły różniczkowania

> [!important] Cztery reguły (tabela z wykładu)
> | # | Reguła | Wzór |
> |---|---|---|
> | 1 | stała i suma | $(cf)' = c\,f'$, $\quad (f \pm g)' = f' \pm g'$ |
> | 2 | iloczyn | $(f\cdot g)' = f'g + fg'$ |
> | 3 | iloraz | $\left(\dfrac fg\right)' = \dfrac{f'g - fg'}{g^2}$ |
> | 4 | złożenie (łańcuchowa) | $\big(f(t(x))\big)' = f'(t(x))\cdot t'(x)$ |

##### 7.1 Stała i suma

Stałą wyciągasz przed pochodną, a sumę różniczkujesz wyraz po wyrazie:
$$\left(3x^4 - 5\sin x + 7\right)' = 3\cdot4x^3 - 5\cos x + 0 = 12x^3 - 5\cos x$$

> [!question] ✏️ Sprawdź się – 7.1
> a) $\left(2x^5 - 4\cos x + 3\sqrt x - 9\right)'$ b) $\left(7e^x - \ln x + \dfrac x3\right)'$
>
> > [!success]- Rozwiązanie
> > a) $2\cdot5x^4 - 4\cdot(-\sin x) + 3\cdot\frac{1}{2\sqrt x} - 0 = 10x^4 + 4\sin x + \frac{3}{2\sqrt x}$ (uwaga na minus przy cosinusie: minus razy minus daje plus).
> > b) $7e^x - \frac1x + \frac13$.

##### 7.2 Iloczyn

> [!tip] „Pierwszy pochodna razy drugi plus pierwszy razy drugi pochodna”
> $$(x^7\sin x)' = \underbrace{7x^6}_{(x^7)'}\sin x + x^7\underbrace{\cos x}_{(\sin x)'}$$

> [!warning] Najczęstszy błąd: $(f\cdot g)' \ne f'\cdot g'$
> Sprawdź na $x\cdot x = x^2$: poprawnie $(x^2)' = 2x$. A „pochodna razy pochodna” dałaby $1\cdot1 = 1$ ✗.

> [!question] ✏️ Sprawdź się – 7.2
> a) $\left(x^3 e^x\right)'$ b) $(x\ln x)'$ c) $\left(\sqrt x\cos x\right)'$
>
> > [!success]- Rozwiązanie
> > a) $3x^2\cdot e^x + x^3\cdot e^x = x^2 e^x(x + 3)$
> > b) $1\cdot\ln x + x\cdot\frac1x = \ln x + 1$
> > c) $\frac{1}{2\sqrt x}\cos x + \sqrt x\cdot(-\sin x) = \frac{\cos x}{2\sqrt x} - \sqrt x\sin x$

##### 7.3 Iloraz

> [!tip] Wzór i jak go zapamiętać
> $$\left(\frac{f}{g}\right)' = \frac{f'g - fg'}{g^2}$$
> - W liczniku jest jak w iloczynie, tylko **minus**, a pierwszy składnik zaczyna się od **pochodnej licznika**.
> - W mianowniku **kwadrat** mianownika.
>
> Przykład z wykładu, skąd się bierze pochodna tangensa:
> $$\left(\frac{\sin x}{\cos x}\right)' = \frac{\cos x\cdot\cos x - \sin x\cdot(-\sin x)}{\cos^2 x} = \frac{\cos^2x + \sin^2x}{\cos^2x} = \frac{1}{\cos^2 x}$$

> [!tip] Nie zawsze trzeba wzoru na iloraz
> - Stała w mianowniku: $\left(\frac{x^3}{5}\right)' = \frac15\cdot3x^2$ (reguła 1).
> - Stała w liczniku: $\frac{1}{x^4} = x^{-4}$, więc pochodna to $-4x^{-5}$ (wzór na potęgę).
> - Czasem warto najpierw **uprościć**: $\frac{e^{x^2 + \ln x + 1}}{\sqrt x} = \frac{e^{x^2+1}\cdot e^{\ln x}}{\sqrt x} = \frac{x\,e^{x^2+1}}{\sqrt x} = \sqrt x\, e^{x^2+1}$ (Z04 2k).

> [!question] ✏️ Sprawdź się – 7.3
> a) $\left(\dfrac{x}{x + 1}\right)'$ b) $\left(\dfrac{x^2 + 1}{x - 3}\right)'$ c) $\left(\dfrac{\sin x}{x}\right)'$ d) $\left(\dfrac{x^2}{7}\right)'$
>
> > [!success]- Rozwiązanie
> > a) $\dfrac{1\cdot(x + 1) - x\cdot 1}{(x + 1)^2} = \dfrac{1}{(x + 1)^2}$
> > b) $\dfrac{2x(x - 3) - (x^2 + 1)\cdot 1}{(x - 3)^2} = \dfrac{2x^2 - 6x - x^2 - 1}{(x - 3)^2} = \dfrac{x^2 - 6x - 1}{(x - 3)^2}$
> > c) $\dfrac{\cos x\cdot x - \sin x\cdot 1}{x^2} = \dfrac{x\cos x - \sin x}{x^2}$
> > d) Stała w mianowniku, wzór na iloraz niepotrzebny: $\frac17\cdot 2x = \frac{2x}{7}$.

##### 7.4 Funkcja złożona – reguła łańcuchowa

To najważniejsza i najczęściej psuta reguła. Złożenie to „funkcja w funkcji”, jak w [[0_Analiza_Matematyczna#9. Złożenie funkcji|W0, rozdz. 9]]: $\sin(x^2)$ to $\sin$ (zewnętrzna) z $x^2$ (wewnętrzna).

> [!important] Reguła łańcuchowa: „zewnętrzna z nietkniętym środkiem, razy pochodna środka”
> $$\big(f(t(x))\big)' = f'\big(t(x)\big)\cdot t'(x)$$
> 1. Rozpoznaj warstwy (pytanie z W0: *co kalkulator liczy na końcu?*).
> 2. Zróżniczkuj **zewnętrzną**, a środek przepisz **bez zmian**.
> 3. **Pomnóż** przez pochodną środka. Jeśli środek też jest złożony, powtarzaj (łańcuch!).

> [!example] Przykłady z wykładu
> - $\left(\sin(x^2)\right)'$: zewnętrzna $\sin t$, środek $t = x^2$. Wynik: $\cos(x^2)\cdot 2x$.
> - $\left(\sin^2 x\right)' = \left((\sin x)^2\right)'$: zewnętrzna $t^2$, środek $\sin x$. Wynik: $2\sin x\cdot\cos x$.
> - $\left(e^{\sin x}\right)'$: zewnętrzna $e^t$, środek $\sin x$. Wynik: $e^{\sin x}\cos x$.
> - $\left(\ln(x^3 + \cos x)\right)'$: zewnętrzna $\ln t$, środek $x^3 + \cos x$. Wynik: $\dfrac{1}{x^3 + \cos x}\cdot(3x^2 - \sin x)$.
> - **Trzy warstwy:** $\left(\sin^2\left(\frac{1 - \ln x}{x}\right)\right)' = 2\sin(\ldots)\cdot\cos(\ldots)\cdot\left(\frac{1 - \ln x}{x}\right)'$, czyli kwadrat, potem sinus, potem środek.

> [!tip] Cebula
> Obierasz warstwy od zewnątrz. Każda warstwa daje jeden czynnik: **pochodną tej warstwy z nietkniętym wnętrzem**. Wszystkie czynniki mnożysz.
> $$\Big(\sqrt{\ln(\cos x)}\Big)' = \underbrace{\frac{1}{2\sqrt{\ln(\cos x)}}}_{\text{pierwiastek}}\cdot\underbrace{\frac{1}{\cos x}}_{\ln}\cdot\underbrace{(-\sin x)}_{\cos}$$

> [!warning] Częste błędy
> - **Zapomniany czynnik środka:** $\left(\sin 3x\right)' = \cos 3x\cdot 3$, a **nie** $\cos 3x$.
> - **Zróżniczkowany środek w zewnętrznej:** $\left(\sin(x^2)\right)' \ne \cos(2x)$. Środek zostaje $x^2$.
> - **Pomylone warstwy:** $\sin^2 x = (\sin x)^2$ (kwadrat na zewnątrz), a $\sin(x^2)$ to coś innego (sinus na zewnątrz).

> [!example] 🌍 Z życia: reguła łańcuchowa uczy sieci neuronowe
> Sieć neuronowa to **złożenie** setek funkcji: wynik warstwy 1 wchodzi do warstwy 2, ta do warstwy 3 i tak dalej. Żeby poprawić wagi, trzeba wiedzieć, jak błąd na końcu zależy od wagi na początku, czyli policzyć pochodną funkcji złożonej. Algorytm **backpropagation**, którym trenuje się ChatGPT, rozpoznawanie twarzy czy tłumacze, to po prostu **reguła łańcuchowa** stosowana warstwa po warstwie od końca. Biblioteki jak PyTorch robią to automatycznie („autograd”), ale pod spodem jest dokładnie ten wzór.

> [!question] ✏️ Sprawdź się – 7.4
> a) $\left(\cos 5x\right)'$ b) $\left((x^2 + 1)^4\right)'$ c) $\left(\ln(\sin x)\right)'$ d) $\left(\sqrt{1 + e^{2x}}\right)'$
>
> > [!success]- Rozwiązanie
> > a) Zewnętrzna $\cos t$, środek $5x$: $\ -\sin 5x\cdot 5 = -5\sin 5x$.
> > b) Zewnętrzna $t^4$, środek $x^2 + 1$: $\ 4(x^2 + 1)^3\cdot 2x = 8x(x^2 + 1)^3$.
> > c) Zewnętrzna $\ln t$, środek $\sin x$: $\ \frac{1}{\sin x}\cdot\cos x = \frac{\cos x}{\sin x} = \operatorname{ctg} x$.
> > d) Trzy warstwy (pierwiastek, $1 + e^{\ldots}$, $2x$):
> > $$\frac{1}{2\sqrt{1 + e^{2x}}}\cdot e^{2x}\cdot 2 = \frac{e^{2x}}{\sqrt{1 + e^{2x}}}$$

> [!success] ➡️ Teraz zrób
> [[#Z04 Zadanie 2 – reguły|Z04: zadanie 2]]. Potem wróć i czytaj rozdział 8.

---

#### 8. Pochodna potęgi z x w wykładniku

Co z $x^x$? To nie jest $x^r$ (wykładnik nie jest stały) ani $a^x$ (podstawa nie jest stała). Wzory z tabeli nie działają.

> [!important] Sztuczka: $t = e^{\ln t}$
> Każdą liczbę dodatnią można zapisać jako $e$ do potęgi jej logarytmu (logarytm i potęga się znoszą, [[0_Analiza_Matematyczna#2. Logarytmy|W0, rozdz. 2]]). Dlatego:
> $$f(x)^{g(x)} = e^{\ln\left(f(x)^{g(x)}\right)} = e^{\,g(x)\cdot\ln f(x)}$$
> Teraz to zwykła funkcja złożona: $e^{\text{coś}}$, więc $(\ldots)' = e^{\text{coś}}\cdot(\text{coś})'$.

> [!example] $y = x^x$ (Z04 3a)
> $$x^x = e^{x\ln x} \quad\Rightarrow\quad (x^x)' = e^{x\ln x}\cdot(x\ln x)' = x^x\left(\ln x + x\cdot\frac1x\right) = x^x(\ln x + 1)$$
> Na końcu $e^{x\ln x}$ zamieniamy z powrotem na $x^x$.
>
> **Ogólny wzór** (dobry do sprawdzania): $\left(f^g\right)' = f^g\cdot\left(g'\ln f + g\cdot\frac{f'}{f}\right)$.

Przykład z wykładu: $\left(\sqrt[x]{x}\right)' = \left(x^{1/x}\right)' = \left(e^{\frac{\ln x}{x}}\right)' = x^{1/x}\cdot\dfrac{1 - \ln x}{x^2}$.

> [!question] ✏️ Sprawdź się – 8
> a) $\left(x^{2x}\right)'$ b) $\left(x^{\sqrt x}\right)'$ c) Sprawdź sztuczką $e^{\ln}$, że $(2^x)' = 2^x\ln 2$.
>
> > [!success]- Rozwiązanie
> > a) $x^{2x} = e^{2x\ln x}$. $\ (2x\ln x)' = 2\ln x + 2x\cdot\frac1x = 2\ln x + 2$. Wynik: $x^{2x}(2\ln x + 2)$.
> > b) $x^{\sqrt x} = e^{\sqrt x\ln x}$. $\ (\sqrt x\ln x)' = \frac{\ln x}{2\sqrt x} + \sqrt x\cdot\frac1x = \frac{\ln x}{2\sqrt x} + \frac{1}{\sqrt x} = \frac{\ln x + 2}{2\sqrt x}$. Wynik: $x^{\sqrt x}\cdot\dfrac{\ln x + 2}{2\sqrt x}$.
> > c) $2^x = e^{x\ln 2}$, a $\ln 2$ to stała, więc $(x\ln 2)' = \ln 2$. Wynik: $e^{x\ln 2}\cdot\ln 2 = 2^x\ln 2$ ✓ (zgadza się z tablicą).

> [!success] ➡️ Teraz zrób
> [[#Z04 Zadanie 3 – x w wykładniku|Z04: zadanie 3*]]. Potem wróć i czytaj rozdział 9.

---

#### 9. Pochodne wyższych rzędów

Pochodna to znowu funkcja, więc można ją różniczkować dalej:
$$f'' = (f')', \qquad f''' = (f'')', \qquad f^{(n)} = \left(f^{(n-1)}\right)', \qquad f'' = \frac{d^2 f}{dx^2}$$

> [!example] Przykład z wykładu
> $(x^3)' = 3x^2$, $\ (x^3)'' = 6x$, $\ (x^3)''' = 6$, $\ (x^3)^{(4)} = 0$. Każda pochodna wielomianu obniża stopień o 1, aż zostaje zero.

> [!tip] Druga pochodna funkcji „abstrakcyjnej” (Z04 5)
> Gdy nie znasz wzoru $f$, tylko wiesz, że jest różniczkowalna, piszesz $f'$, $f''$ jako „czarne skrzynki” i stosujesz reguły:
> $$\left(f(x^2)\right)' = f'(x^2)\cdot 2x$$
> $$\left(f(x^2)\right)'' = \left(f'(x^2)\cdot 2x\right)' = \underbrace{f''(x^2)\cdot2x}_{\text{łańcuch}}\cdot 2x + f'(x^2)\cdot 2 = 4x^2 f''(x^2) + 2f'(x^2)$$
> Druga pochodna to **pochodna iloczynu** $f'(x^2)\cdot 2x$, a w pierwszym czynniku znowu łańcuch.

> [!example] 🌍 Z życia: druga pochodna to przyspieszenie i „wygięcie”
> - Położenie, **prędkość** ($f'$), **przyspieszenie** ($f''$). Spadek $16t^2$: prędkość $32t$, przyspieszenie $32$ ft/s², czyli stałe $g$!
> - Na wykresie $f'' > 0$ oznacza wykres wygięty jak uśmiech ∪, a $f'' < 0$ jak smutna buźka ∩. To narzędzie z W4 (punkty przegięcia).
> - W ekonomii: „dynamika wzrostu PKB spada” to $f' > 0$, ale $f'' < 0$.

> [!question] ✏️ Sprawdź się – 9
> a) $f(x) = x^4 - 2x^3 + x$: policz $f'$, $f''$, $f'''$, $f^{(4)}$, $f^{(5)}$.
> b) $y = \sin 2x$: policz $y''$. c) $y = x\ln x$: policz $y''$.
> d) $f$ dwukrotnie różniczkowalna, $y = f(e^x)$: policz $y''$.
>
> > [!success]- Rozwiązanie
> > a) $f' = 4x^3 - 6x^2 + 1$, $\ f'' = 12x^2 - 12x$, $\ f''' = 24x - 12$, $\ f^{(4)} = 24$, $\ f^{(5)} = 0$.
> > b) $y' = 2\cos 2x$, $\ y'' = 2\cdot(-\sin 2x)\cdot 2 = -4\sin 2x$.
> > c) $y' = \ln x + 1$ (iloczyn, jak w 7.2), $\ y'' = \frac1x$.
> > d) $y' = f'(e^x)\cdot e^x$. Druga to pochodna iloczynu:
> > $$y'' = \underbrace{f''(e^x)\cdot e^x}_{\text{łańcuch}}\cdot e^x + f'(e^x)\cdot e^x = e^{2x}f''(e^x) + e^x f'(e^x)$$

> [!success] ➡️ Teraz zrób
> [[#Z04 Zadanie 4 – druga pochodna|Z04: zadania 4–5]]. Potem wróć i czytaj rozdział 10.

---

#### 10. Styczna i przybliżenie liniowe

> [!important] Równanie stycznej do wykresu $f$ w punkcie $(x_0, f(x_0))$
> $$y = f(x_0) + f'(x_0)\,(x - x_0)$$
> To prosta przechodząca przez punkt styczności, o nachyleniu $f'(x_0)$.

> [!tip] Przepis w 4 krokach
> 1. Policz $f(x_0)$ (jeśli nie jest podane).
> 2. Policz $f'(x)$.
> 3. Wstaw: $f'(x_0)$.
> 4. Wstaw do wzoru i uprość do postaci $y = mx + b$.
>
> Przykład (Z04 7a): $y = x^2 + 2x$ w $(1, 3)$. $f' = 2x + 2$, $f'(1) = 4$. Styczna: $y = 3 + 4(x - 1) = 4x - 1$.
> **Sprawdzenie:** w $x = 1$ styczna daje $4 - 1 = 3$ ✓ (przechodzi przez punkt).

> [!example] 🌍 Z życia: przybliżenie liniowe, czyli liczenie w głowie
> Blisko punktu styczności wykres **prawie pokrywa się** ze styczną, więc $f(x) \approx f(x_0) + f'(x_0)(x - x_0)$.
>
> **Ile to jest $\sqrt{4{,}1}$?** $f = \sqrt x$, $x_0 = 4$, $f(4) = 2$, $f'(x) = \frac{1}{2\sqrt x}$, $f'(4) = \frac14$.
> $$\sqrt{4{,}1} \approx 2 + \tfrac14\cdot0{,}1 = 2{,}025 \qquad(\text{dokładnie } 2{,}02485\ldots)$$
> W ten sposób fizycy upraszczają wzory ($\sin x \approx x$ dla małych kątów to styczna do sinusa w zerze), a inżynierowie „linearyzują” układy. W W3 zobaczysz rozwinięcie: **wielomian Taylora**, czyli przybliżenie parabolą i wyższymi wielomianami.

> [!question] ✏️ Sprawdź się – 10
> Napisz równanie stycznej:
> a) $y = x^3 - 2x$ w $x_0 = 2$ b) $y = e^x$ w $x_0 = 0$ c) $y = \frac1x$ w $x_0 = 2$
> d) Oszacuj $\sqrt[3]{8{,}12}$ przybliżeniem liniowym w $x_0 = 8$.
>
> > [!success]- Rozwiązanie
> > a) $f(2) = 8 - 4 = 4$, $\ f' = 3x^2 - 2$, $\ f'(2) = 10$. $\ y = 4 + 10(x - 2) = 10x - 16$. Sprawdzenie: $20 - 16 = 4$ ✓.
> > b) $f(0) = 1$, $\ f'(0) = e^0 = 1$. $\ y = 1 + 1\cdot(x - 0) = x + 1$.
> > c) $f(2) = \frac12$, $\ f' = -\frac{1}{x^2}$, $\ f'(2) = -\frac14$. $\ y = \frac12 - \frac14(x - 2) = -\frac14 x + 1$.
> > d) $f = \sqrt[3]{x} = x^{1/3}$, $\ f(8) = 2$, $\ f' = \frac{1}{3\sqrt[3]{x^2}}$, $\ f'(8) = \frac{1}{3\cdot 4} = \frac{1}{12}$. $\ \sqrt[3]{8{,}12} \approx 2 + \frac{1}{12}\cdot 0{,}12 = 2{,}01$ (dokładnie $2{,}00995\ldots$).

> [!success] ➡️ Teraz zrób
> [[#Z04 Zadanie 6 – styczna|Z04: zadania 6–7]]. Na koniec [[#Ściąga – najważniejsze wzory i zasady|ściąga]] i [[#Test gotowości|test gotowości]].

---

## Ćwiczenia

> [!info] Zasada
> Na kartkach są dwie zasady: **1. Należy zawsze uzasadniać rozwiązanie**, czyli napisać, w jaki sposób zostało otrzymane. **2. Zadania na niebiesko są dla ambitnego studenta** (tu oznaczone gwiazdką * albo „dla ambitnych”).
>
> Pod każdym zadaniem jest najpierw ramka **📝 Treść zadania** z poleceniem i podpunktami jak na kartce. Najpierw rozwiąż sam, potem rozwiń rozwiązanie.

### Z03 – Granice funkcji, ciągłość, asymptoty

Treść: [[Z03 granice funkcji asymptoty.pdf]] · Oficjalne rozwiązania: [[Z03 granice funkcji asymptoty_Rozwiazania.pdf]]

#### Z03 Zadanie 1 – symbole z f i g
Teoria: [[#1.5 Ważne granice funkcji|1.5]], symbole z [[1_Analiza_Matematyczna#3. Rachunek na nieskończonościach|W1, rozdz. 3]] i [[1_Analiza_Matematyczna#5. Symbole nieoznaczone|5]]

> [!question] 📝 Treść zadania 1
> **Jeżeli $\lim\limits_{x\to a} f(x) = 0$, $\ \lim\limits_{x\to a} g(x) = \infty$, to czy wiemy, jakie są następujące granice:**
>
> a) $\lim\limits_{x\to a}[f(x) + g(x)]$ b) $\lim\limits_{x\to a}\dfrac{f(x)}{g(x)}$ c) $\lim\limits_{x\to a} f(x)^{g(x)}$
> d) $\lim\limits_{x\to a}\big(2 + f(x)\big)^{g(x)}$ e) $\lim\limits_{x\to a} f(x)g(x)$ f) $\lim\limits_{x\to a} g(x)^{f(x)}$
> g) $\lim\limits_{x\to a}\dfrac{1}{g(x)}$ h) $\lim\limits_{x\to a}\dfrac{1}{f(x)}$
> i) liczba $x = 3$ jest w dziedzinie funkcji $f$ oraz $\lim\limits_{x\to3}\dfrac{f(x)}{x-3} = a$, $a \in \mathbb{R}$. Oblicz $f(3)$.
> j) jeśli $\lim\limits_{x\to3}\dfrac{f(x) - 4}{x - 2} = 3$, wyznacz $\lim\limits_{x\to3} f(x)$.

> [!success]- Rozwiązanie a)–h)
> Wstawiasz „typy” i sprawdzasz, czy są oznaczone:
>
> | | Typ | Wynik |
> |---|---|---|
> | a) | $[0 + \infty]$ | $\infty$ |
> | b) | $\left[\frac{0}{\infty}\right] = \left[0\cdot\frac1\infty\right]$ | $0$ |
> | c) | $[(0^+)^\infty]$ | $0$ (zakładamy $f > 0$, bo inaczej potęga nie ma sensu) |
> | d) | $[(2 + 0)^\infty] = [2^\infty]$ | $\infty$ (podstawa dąży do $2$, a nie do $1$!) |
> | e) | $[0\cdot\infty]$ | **nie wiadomo** (nieoznaczony) |
> | f) | $[\infty^0]$ | **nie wiadomo** (nieoznaczony) |
> | g) | $\left[\frac1\infty\right]$ | $0$ |
> | h) | $\left[\frac10\right]$ | **nie wiadomo**, bo nie znamy znaku $f$: $\frac{1}{0^+} = \infty$, $\frac{1}{0^-} = -\infty$, a gdy $f$ skacze ze znakiem, granicy nie ma |

> [!success]- Rozwiązanie i)
> Mianownik $x - 3 \to 0$, a granica jest **skończona** ($a$). To możliwe tylko wtedy, gdy licznik też dąży do zera (inaczej byłoby $\left[\frac{\text{liczba}\ne0}{0}\right] = \pm\infty$). Formalnie:
> $$\lim f(x) = \lim\left(\frac{f(x)}{x-3}\cdot(x - 3)\right) = a\cdot 0 = 0$$
> Przy założeniu, że $f$ jest ciągła w $3$ (np. elementarna), **$f(3) = 0$**.

> [!success]- Rozwiązanie j)
> Tu mianownik $x - 2 \to 1$ (nie zero!). Więc $\lim(f(x) - 4) = 3\cdot 1 = 3$, czyli **$\lim\limits_{x\to3} f(x) = 7$**.

#### Z03 Zadanie 2 – granice w nieskończoności
Teoria: [[#1.2 Granice w plus i minus nieskończoności|1.2]], techniki z [[1_Analiza_Matematyczna#6. Techniki liczenia granic (skrzynka z narzędziami)|W1, rozdz. 6]]

> [!question] 📝 Treść zadania 2
> **Wyznacz granice w $\pm\infty$:**
>
> a) $\lim\limits_{x\to\infty}(x^3 - 2x + 3)$ b) $\lim\limits_{x\to-\infty}(x^4 - 3x^3 + 3)$ c) $\lim\limits_{x\to-\infty}(x^5 + x^4 - 2x^3 + 1)$
> d) $\lim\limits_{x\to-\infty}\dfrac{x^2 - 4x + 2}{2 + 2x - 4x^2}$ e) $\lim\limits_{x\to-\infty}\dfrac{-x^5}{1 + 4x^2}$ f) $\lim\limits_{x\to\infty}\dfrac{3^{2x} - 1}{6^x - 1}$
> g) $\lim\limits_{x\to-\infty}\left(\sqrt{x^2} + x\right)$ h) $\lim\limits_{x\to\infty}\left(\sqrt{x^2 + 3x + 1} - x\right)$ i) $\lim\limits_{x\to-\infty}\left(\sqrt{x^2 + 4x + 5} + x\right)$

> [!success]- Rozwiązanie a)–c): wielomiany
> Wielomian zachowuje się jak jego szef (najwyższa potęga).
> a) $x^3\left(1 - \frac{2}{x^2} + \frac{3}{x^3}\right) \to \infty\cdot1$. **$= \infty$**
> b) szef $x^4$, a przy $x \to -\infty$ potęga parzysta jest dodatnia: $x^4\left(1 - \frac3x + \frac{3}{x^4}\right) \to +\infty$. **$= +\infty$**
> c) szef $x^5$, potęga nieparzysta, więc ujemna: $x^5\left(1 + \frac1x - \frac{2}{x^2} + \frac{1}{x^5}\right) \to -\infty\cdot1$. **$= -\infty$**

> [!success]- Rozwiązanie d)–f): ułamki
> d) Stopnie równe (2 i 2), więc iloraz liczb przy szefach: $\frac{1}{-4}$. Formalnie dzielisz przez $x^2$: $\dfrac{1 - \frac4x + \frac{2}{x^2}}{\frac{2}{x^2} + \frac2x - 4} \to \dfrac{1}{-4}$. **$= -\dfrac14$**
> e) Stopień 5 > 2, więc $\pm\infty$. Znak: $\frac{-x^5}{4x^2} = -\frac{x^3}{4}$, a dla $x \to -\infty$ jest $x^3 \to -\infty$, więc $-\frac{x^3}{4} \to +\infty$. **$= +\infty$**
> f) $3^{2x} = 9^x$. Dzielisz przez $6^x$ (szef mianownika): $\dfrac{\left(\frac96\right)^x - \frac{1}{6^x}}{1 - \frac{1}{6^x}} = \dfrac{1{,}5^x - 6^{-x}}{1 - 6^{-x}} \to \dfrac{\infty - 0}{1}$. **$= \infty$**

> [!success]- Rozwiązanie g)
> **Pułapka z [[#1.2 Granice w plus i minus nieskończoności|1.2]]:** $\sqrt{x^2} = \lvert x\rvert = -x$ dla $x < 0$.
> $$\sqrt{x^2} + x = -x + x = 0$$
> **$= 0$**

> [!success]- Rozwiązanie h)
> $[\infty - \infty]$, szefowie się znoszą ($\sqrt{x^2} = x$ i $-x$), więc sprzężenie:
> $$\frac{(x^2 + 3x + 1) - x^2}{\sqrt{x^2 + 3x + 1} + x} = \frac{3x + 1}{\sqrt{x^2 + 3x + 1} + x} = \frac{x\left(3 + \frac1x\right)}{x\left(\sqrt{1 + \frac3x + \frac{1}{x^2}} + 1\right)} \to \frac{3}{2}$$
> **$= \dfrac32$**
> (Oficjalne rozwiązanie pokazuje też, że samo wyciągnięcie $x$ przed nawias daje $[\infty\cdot0]$ i nic nie rozwiązuje.)

> [!success]- Rozwiązanie i)
> $x \to -\infty$: $\sqrt{x^2 + \ldots} \to +\infty$, a $x \to -\infty$, więc $[\infty - \infty]$. Sprzężenie:
> $$\frac{(x^2 + 4x + 5) - x^2}{\sqrt{x^2 + 4x + 5} - x} = \frac{4x + 5}{\sqrt{x^2 + 4x + 5} - x}$$
> Wyciągasz $x$, pamiętając, że **spod pierwiastka wychodzi $-x$**:
> $$\frac{x\left(4 + \frac5x\right)}{-x\sqrt{1 + \frac4x + \frac{5}{x^2}} - x} = \frac{x\left(4 + \frac5x\right)}{-x\left(\sqrt{1 + \ldots} + 1\right)} \to \frac{4}{-(1+1)} = -2$$
> **$= -2$**

#### Z03 Zadanie 3 – typ e
Teoria: [[#1.7 Typ e dla funkcji|1.7]]

> [!question] 📝 Treść zadania 3
> **„Granica typu $e$”:**
>
> a) $\lim\limits_{x\to\infty}\left(\dfrac{2x-1}{2x+5}\right)^{3x}$ b) $\lim\limits_{x\to\infty}\left(\dfrac{3x^2-1}{3x^2+5}\right)^{3x^2+4}$

> [!success]- Rozwiązanie a)
> $\frac{2x-1}{2x+5} = \frac{2x + 5 - 6}{2x+5} = 1 + \frac{-6}{2x+5}$. Dopasowanie wykładnika:
> $$\left[\left(1 + \frac{-6}{2x+5}\right)^{2x+5}\right]^{\frac{3x}{2x+5}} \to \left(e^{-6}\right)^{3/2} = e^{-9}$$
> **$= e^{-9}$**

> [!success]- Rozwiązanie b)
> $\frac{3x^2-1}{3x^2+5} = 1 + \frac{-6}{3x^2+5}$.
> $$\left[\left(1 + \frac{-6}{3x^2+5}\right)^{3x^2+5}\right]^{\frac{3x^2+4}{3x^2+5}} \to \left(e^{-6}\right)^1$$
> **$= e^{-6}$**

#### Z03 Zadanie 4 – sprzężenie
Teoria: [[#1.4 Typ zero przez zero – skróć albo sprzężenie|1.4]]

> [!question] 📝 Treść zadania 4
> **„Mnożenie przez sprzężenie”:**
>
> a) $\lim\limits_{x\to0^+}\dfrac{x}{\sqrt{x^2+9} - 3}$ b) $\lim\limits_{x\to0^-}\dfrac{x}{\sqrt{x^2+9} - 3}$ c) $\lim\limits_{x\to4}\dfrac{x-4}{\sqrt x - 2}$
> d) $\lim\limits_{x\to25}\dfrac{\sqrt x - 5}{x - 25}$ e) $\lim\limits_{x\to0^+}\dfrac{x + \sqrt x}{x - \sqrt x}$

> [!success]- Rozwiązanie a), b)
> $\left[\frac00\right]$. Mnożysz licznik i mianownik przez $\sqrt{x^2+9} + 3$:
> $$\frac{x\left(\sqrt{x^2+9} + 3\right)}{(x^2 + 9) - 9} = \frac{x\left(\sqrt{x^2+9}+3\right)}{x^2} = \frac{\sqrt{x^2+9} + 3}{x} \to \left[\frac{6}{0^\pm}\right]$$
> a) $x \to 0^+$: **$= +\infty$** b) $x \to 0^-$: **$= -\infty$**

> [!success]- Rozwiązanie c)
> $x - 4 = (\sqrt x - 2)(\sqrt x + 2)$, więc $\dfrac{(\sqrt x - 2)(\sqrt x + 2)}{\sqrt x - 2} = \sqrt x + 2 \to 4$. **$= 4$**

> [!success]- Rozwiązanie d)
> Rozpisane w [[#1.4 Typ zero przez zero – skróć albo sprzężenie|1.4]]: $\dfrac{1}{\sqrt x + 5} \to \dfrac{1}{10}$. **$= \dfrac{1}{10}$**

> [!success]- Rozwiązanie e)
> Wyciągasz $\sqrt x$ (bo $x = \sqrt x\cdot\sqrt x$):
> $$\frac{\sqrt x\left(\sqrt x + 1\right)}{\sqrt x\left(\sqrt x - 1\right)} = \frac{\sqrt x + 1}{\sqrt x - 1} \to \frac{1}{-1}$$
> **$= -1$**

#### Z03 Zadanie 5 – granice jednostronne
Teoria: [[#1.3 Granica w punkcie – najpierw wstaw|1.3]]

> [!question] 📝 Treść zadania 5
> **Oblicz granice jednostronne:**
>
> a) $\lim\limits_{x\to0^+}\dfrac{2x^5 + 3x^3 - 6x}{x^5 + x^2}$ b) $\lim\limits_{x\to0^-}\dfrac{2x^5 + 3x^3 - 6x}{x^5 + x^2}$
> c) $\lim\limits_{x\to0^+} 2^{1/x}$ d) $\lim\limits_{x\to0^-} 2^{1/x}$ e) $\lim\limits_{x\to3^-} 2^{\frac{1}{x-3}}$
> f) $\lim\limits_{x\to0^-}\operatorname{arctan}\dfrac1x$ g) $\lim\limits_{x\to0^-}\operatorname{arctan}\dfrac{1}{x^2}$

> [!success]- Rozwiązanie a), b)
> $\left[\frac00\right]$. Wyciągasz $x$ z licznika i $x^2$ z mianownika:
> $$\frac{x\left(2x^4 + 3x^2 - 6\right)}{x^2\left(x^3 + 1\right)} = \frac{2x^4 + 3x^2 - 6}{x\left(x^3 + 1\right)} \to \left[\frac{-6}{0^\pm}\right]$$
> a) $x \to 0^+$: $\frac{-6}{0^+}$. **$= -\infty$** b) $x \to 0^-$: $\frac{-6}{0^-}$. **$= +\infty$**

> [!success]- Rozwiązanie c), d), e)
> c) $\frac1x \to +\infty$, więc $2^{+\infty} = \infty$. **$= \infty$**
> d) $\frac1x \to -\infty$, więc $2^{-\infty} = \frac{1}{2^\infty} = 0$. **$= 0$**
> Z c) i d): granica $\lim\limits_{x\to0} 2^{1/x}$ **nie istnieje**.
> e) $x \to 3^-$: $x - 3 \to 0^-$, $\frac{1}{x-3} \to -\infty$, więc $2^{-\infty}$. **$= 0$**

> [!success]- Rozwiązanie f), g)
> f) $\frac1x \to -\infty$, a $\operatorname{arctg}(-\infty) = -\frac{\pi}{2}$. **$= -\dfrac{\pi}{2}$**
> g) $\frac{1}{x^2} \to +\infty$ (kwadrat zawsze dodatni!), więc $\operatorname{arctg}(+\infty)$. **$= \dfrac{\pi}{2}$**

#### Z03 Zadanie 6 – typ sin x przez x
Teoria: [[#1.6 Typ sin x przez x|1.6]]. Na kartce: „dla ambitnych”, a prowadzący pisze, że rozwiązuje się je regułą de l'Hospitala (W3). Da się jednak wcześniej, sposobem z 1.6.

> [!question] 📝 Treść zadania 6
> **„Granica typu $\frac{\sin x}{x}$”:**
>
> a) $\lim\limits_{x\to0}\dfrac{\sin 3x}{5x}$ b) $\lim\limits_{x\to0}\dfrac{\sin 2x}{\sin 7x}$ c) $\lim\limits_{x\to0}\dfrac{\tan 7x}{\tan 6x}$ d) $\lim\limits_{x\to5}\dfrac{x-5}{\sin(3(x-5))}$
> e) $\lim\limits_{x\to0^+}\dfrac{\sin(3x^2)}{\sin 5x}$ f) $\lim\limits_{x\to2^+}\dfrac{\sin x}{x^2}$ g) $\lim\limits_{x\to2}\dfrac{\sin(x^2 - 4)}{\sin(x - 2)}$ h) $\lim\limits_{x\to0}\dfrac{\sin(2\sin 5x)}{\sin 5x}$

> [!success]- Rozwiązanie a)–d)
> a) $\frac{\sin3x}{3x}\cdot\frac{3x}{5x} \to 1\cdot\frac35$. **$= \dfrac35$**
> b) $\dfrac{\frac{\sin2x}{2x}\cdot2x}{\frac{\sin7x}{7x}\cdot7x} \to \dfrac{2}{7}$. **$= \dfrac27$**
> c) $\operatorname{tg} t \approx t$ (bonus z 1.5): $\dfrac{\frac{\tan7x}{7x}\cdot7x}{\frac{\tan6x}{6x}\cdot6x} \to \dfrac76$. **$= \dfrac76$**
> d) $t = 3(x-5) \to 0$, $x - 5 = \frac t3$: $\dfrac{t/3}{\sin t} \to \dfrac13$. **$= \dfrac13$**

> [!success]- Rozwiązanie e)–h)
> e) $\dfrac{\frac{\sin3x^2}{3x^2}\cdot3x^2}{\frac{\sin5x}{5x}\cdot5x} \to \dfrac{3x^2}{5x} = \dfrac{3x}{5} \to 0$. **$= 0$**
> f) **Pułapka:** argument sinusa dąży do $2$, a nie do $0$. Nie ma symbolu nieoznaczonego, wstawiasz. **$= \dfrac{\sin 2}{4}$** $\approx 0{,}227$
> g) $x^2 - 4 = (x-2)(x+2)$:
> $$\frac{\frac{\sin(x^2-4)}{x^2-4}\cdot(x-2)(x+2)}{\frac{\sin(x-2)}{x-2}\cdot(x-2)} \to \frac{1\cdot(x+2)}{1} \to 4$$
> **$= 4$**
> h) $t = \sin 5x \to 0$: $\dfrac{\sin 2t}{t} = \dfrac{\sin2t}{2t}\cdot2 \to 2$. **$= 2$**

#### Z03 Zadanie 7 – granica nie istnieje
Teoria: [[#1.8 Kiedy granica nie istnieje|1.8]]. Na kartce: „dla ambitnych”.

> [!question] 📝 Treść zadania 7
> **Wykaż, że następująca granica nie istnieje** (wsk.: albo granice prawo-, lewostronne, albo różne ciągi):
>
> a) $\lim\limits_{x\to0}\dfrac{\lvert x\rvert}{x}$ b) $\lim\limits_{x\to1}\dfrac{1}{x^2-1}$ c) $\lim\limits_{x\to0} e^{1/x}$ d) $\lim\limits_{x\to0}\left(\dfrac{\pi}{2} - \arctan\dfrac1x\right)$

> [!success]- Rozwiązanie a)–d)
> a) Dla $x > 0$: $\frac{x}{x} = 1$, dla $x < 0$: $\frac{-x}{x} = -1$. Z prawej $1$, z lewej $-1$. **Nie istnieje.**
> b) $\frac{1}{(x-1)(x+1)}$: z prawej $\left[\frac{1}{0^+}\right] = +\infty$, z lewej $\left[\frac{1}{0^-}\right] = -\infty$ (rozpisane w 1.3). **Nie istnieje.**
> c) Z prawej $e^{+\infty} = \infty$, z lewej $e^{-\infty} = 0$. **Nie istnieje.**
> d) Z prawej $\frac{\pi}{2} - \operatorname{arctg}(+\infty) = \frac\pi2 - \frac\pi2 = 0$, z lewej $\frac\pi2 - \left(-\frac\pi2\right) = \pi$. **Nie istnieje.**

#### Z03 Zadanie 8 – czy ciągła
Teoria: [[#2.1 Definicja – trzy warunki|2.1]], [[#2.2 Co jest ciągłe automatycznie|2.2]]

> [!question] 📝 Treść zadania 8
> **Czy następujące funkcje są ciągłe?**
>
> a) $f(x) = \begin{cases}\frac{\sin x}{x}, & x \ne 0\\ 2, & x = 0\end{cases}$ b) $f(x) = \begin{cases}\frac{x}{\lvert x\rvert}, & x \ne 0\\ 5, & x = 0\end{cases}$
> c) $f(x) = \begin{cases}x\sin\frac1x, & x \ne 0\\ 0, & x = 0\end{cases}$ d) $f(x) = \begin{cases}e^{-1/x}, & x \ne 0\\ 0, & x = 0\end{cases}$

> [!success]- Rozwiązanie a)
> Rozpisane w [[#2.2 Co jest ciągłe automatycznie|2.2]]: granica w zerze to $1$, a $f(0) = 2$. **Nieciągła** (w zerze).

> [!success]- Rozwiązanie b)
> Z prawej $\frac{x}{x} = 1$, z lewej $\frac{x}{-x} = -1$. Granica nie istnieje (skok), więc warunek 2 nie zachodzi. **Nieciągła** (w zerze), niezależnie od wartości $f(0) = 5$.

> [!success]- Rozwiązanie c)
> Trzy funkcje (1.9): $-\lvert x\rvert \le x\sin\frac1x \le \lvert x\rvert \to 0$, więc granica wynosi $0 = f(0)$. Poza zerem funkcja jest elementarna. **Ciągła.**

> [!success]- Rozwiązanie d)
> - $x \to 0^+$: $-\frac1x \to -\infty$, $e^{-\infty} = 0$ ✓ (zgadza się z $f(0) = 0$)
> - $x \to 0^-$: $-\frac1x \to +\infty$, $e^{+\infty} = \infty$ ✗
>
> Granica z lewej jest nieskończona. **Nieciągła** w zerze (ciągła tylko „z prawej”).

#### Z03 Zadanie 9 – parametr a
Teoria: [[#2.3 Funkcje sklejane i parametry|2.3]]

> [!question] 📝 Treść zadania 9
> **Wyznacz wartości parametru $a \in \mathbb{R}$, tak aby następująca funkcja była ciągła w swojej dziedzinie:**
> $$f(x) = \begin{cases}a\,\dfrac{\sin(x-2)}{x-2}, & x < 2\\[2mm] \operatorname{arctg}\left(\dfrac x2\right), & x \ge 2\end{cases}$$

> [!success]- Rozwiązanie
> Rozpisane w [[#2.3 Funkcje sklejane i parametry|2.3]]: z lewej $a$, z prawej i w punkcie $\frac\pi4$.
> **$a = \dfrac{\pi}{4}$**
> (W oficjalnym rozwiązaniu jest literówka „elementarna w $R\{0\}$”, a chodzi o $\mathbb{R}\setminus\{2\}$.)

#### Z03 Zadanie 10 – parametry a i b
Teoria: [[#2.3 Funkcje sklejane i parametry|2.3]]

> [!question] 📝 Treść zadania 10
> **Wyznacz wartości parametrów $a, b \in \mathbb{R}$, tak aby następująca funkcja była ciągła w swojej dziedzinie:**
>
> a) $f(x) = \begin{cases}-2\sin x, & x \le -\frac{\pi}{2}\\ a\sin x + b, & -\frac\pi2 < x < \frac\pi2\\ \cos x, & \frac\pi2 \le x\end{cases}$ b) $f(x) = \begin{cases}a + \operatorname{arctg}\left(\frac{1}{x-1}\right), & x < 1\\ \frac{\pi}{2}, & 1 \le x < 2\\ b + \ln(x-1), & 2 \le x\end{cases}$

> [!success]- Rozwiązanie a)
> **Punkt $-\frac\pi2$:** wartość $f\left(-\frac\pi2\right) = -2\sin\left(-\frac\pi2\right) = 2$; z lewej też $2$; z prawej $a\sin\left(-\frac\pi2\right) + b = -a + b$. Warunek: $-a + b = 2$.
> **Punkt $\frac\pi2$:** wartość $\cos\frac\pi2 = 0$; z prawej $0$; z lewej $a\sin\frac\pi2 + b = a + b$. Warunek: $a + b = 0$.
> Układ: dodając stronami, $2b = 2$, więc $b = 1$ i $a = -1$.
> **$a = -1,\ b = 1$**

> [!success]- Rozwiązanie b)
> **Punkt $1$:** wartość $f(1) = \frac\pi2$, z prawej $\frac\pi2$. Z lewej: $x \to 1^-$, $\frac{1}{x-1} \to -\infty$, $\operatorname{arctg} \to -\frac\pi2$, więc granica wynosi $a - \frac\pi2$. Warunek: $a - \frac\pi2 = \frac\pi2$, czyli $a = \pi$.
> **Punkt $2$:** wartość $f(2) = b + \ln 1 = b$, z prawej $b$, z lewej $\frac\pi2$. Warunek: $b = \frac\pi2$.
> **$a = \pi,\ b = \dfrac{\pi}{2}$**

#### Z03 Zadanie 11 – dopasuj wykres
Teoria: [[#3. Asymptoty|rozdział 3]]

> [!question] 📝 Treść zadania 11
> **Dopasuj wzór funkcji (a)–(f) do wykresu (I–VI). Uzasadnij wybór.**
>
> (a) $f(x) = \dfrac{1}{x-1}$ (b) $f(x) = \dfrac{x}{x-1}$ (c) $f(x) = \dfrac{1}{(x-1)^2}$
> (d) $f(x) = \dfrac{1}{x^2-1}$ (e) $f(x) = \dfrac{x}{(x-1)^2}$ (f) $f(x) = \dfrac{x}{x^2-1}$
>
> ![[AM_W2_z03_wykresy.svg|640]]
> (Wykresy narysowane od nowa, w tym samym układzie co na kartce.)

> [!success]- Rozwiązanie: jak myśleć
> Patrz na **cechy**, które da się odczytać ze wzoru bez liczenia:
> 1. **Ile asymptot pionowych?** Mianownik $x^2 - 1$ daje dwie ($\pm1$), czyli (d) i (f): wykresy V i VI. Reszta ma jedną ($x = 1$).
> 2. **Czy przechodzi przez $(0, 0)$?** Tak, gdy w liczniku jest $x$: (b), (e), (f).
> 3. **Kwadrat w mianowniku** $(x-1)^2 > 0$: przy $x = 1$ z **obu stron ten sam znak** (dwa ramiona w górę): (c), (e).
> 4. **Asymptota pozioma:** stopnie równe, np. $\frac{x}{x-1} \to 1$, więc $y = 1$ tylko w (b).
>
> | Wzór | Cechy | Wykres |
> |---|---|---|
> | (a) $\frac{1}{x-1}$ | jedna pionowa, nie przez zero, z lewej $-\infty$, z prawej $+\infty$ | **IV** |
> | (b) $\frac{x}{x-1}$ | przez zero, pozioma $y = 1$ | **III** |
> | (c) $\frac{1}{(x-1)^2}$ | obie strony w górę, nie przez zero | **II** |
> | (d) $\frac{1}{x^2-1}$ | dwie pionowe, między nimi „czapka” w dół, $f(0) = -1$ | **VI** |
> | (e) $\frac{x}{(x-1)^2}$ | przez zero, obie strony $x = 1$ w górę | **I** |
> | (f) $\frac{x}{x^2-1}$ | dwie pionowe, przez zero | **V** |

#### Z03 Zadanie 12 – asymptoty
Teoria: [[#3.4 Przepis na wszystkie asymptoty|3.4]]

> [!question] 📝 Treść zadania 12
> **Wyznacz asymptoty następujących funkcji:**
>
> a) $f(x) = \dfrac{1}{x^2-1}$ b) $f(x) = \dfrac{x^2}{x^2-1}$ c) $f(x) = \dfrac{x^3}{x^2-2}$
> d*) $f(x) = \dfrac{x^4}{(1+x)^3}$ e*) $f(x) = \sqrt{\dfrac{x^3}{x-1}}$ f) $f(x) = e^{\frac{1}{x^2-1}}$
> g) $f(x) = \dfrac{x-3}{\sqrt{x^2-4}}$ h) $f(x) = \dfrac{\ln x}{x-2}$ i) $f(x) = \dfrac{2^x + 3^x}{2^x - 3^x}$
> i') (po wykładzie 5; w PDF drugie „i)”) $f(x) = x\arctan x$
> j) (po wykładzie 5) $f(x) = \begin{cases}\frac{x^2}{x-1}, & x < 1\\ \frac{\ln x}{x}, & x \ge 1\end{cases}$ k) (po wykładzie 5) $f(x) = \begin{cases}\frac{e^x}{x-4}, & x \le 2\\ \frac{3x^2}{x^2-4}, & x > 2\end{cases}$
> l) (po wykładzie 5) $f(x) = \dfrac{\ln(x-3)}{e^{x-4} - 1}$
> (Na kartce jest jeszcze puste „m)”.)

> [!success]- Rozwiązanie a) i b)
> **a)** $D = \mathbb{R}\setminus\{-1, 1\}$, $\ \frac{1}{(x-1)(x+1)}$.
> - $x \to -1^-$: $+\infty$; $\ x \to -1^+$: $-\infty$; $\ x \to 1^-$: $-\infty$; $\ x \to 1^+$: $+\infty$ (znaki jak w 1.3).
> - $x \to \pm\infty$: $\frac{1}{\infty} = 0$.
>
> **Odp.:** $x = -1$, $x = 1$ (pionowe obustronne), $y = 0$ (pozioma w $\pm\infty$).
>
> **b)** Ta sama dziedzina i te same znaki przy $\pm1$ (licznik $x^2 \to 1 > 0$ nie zmienia znaku). W $\pm\infty$: stopnie równe, więc $\to 1$.
> **Odp.:** $x = \pm1$ (pionowe obustronne), $y = 1$ (pozioma w $\pm\infty$).

> [!success]- Rozwiązanie c)
> $D$: $x^2 \ne 2$, czyli $x \ne \pm\sqrt2$. Licznik w $\pm\sqrt2$ jest niezerowy ($\pm2\sqrt2$), więc obie granice to $\pm\infty$: **pionowe** $x = \pm\sqrt2$.
> Ukośna: stopień 3 = 2 + 1.
> $m = \lim\frac{x^3}{x(x^2-2)} = 1$, $\quad k = \lim\left(\frac{x^3}{x^2-2} - x\right) = \lim\frac{2x}{x^2-2} = 0$.
> **Odp.:** $x = -\sqrt2$, $x = \sqrt2$, ukośna $y = x$ (w $\pm\infty$).

> [!success]- Rozwiązanie d*)
> $D = \mathbb{R}\setminus\{-1\}$. $x \to -1^-$: $(1+x)^3 \to 0^-$, licznik $\to 1$, więc $-\infty$. $x \to -1^+$: $+\infty$. **Pionowa** $x = -1$ obustronna.
> Ukośna: $m = \lim\frac{x^4}{x(1+x)^3} = \lim\frac{x^3}{(1+x)^3} = 1$.
> $k = \lim\left[\frac{x^4}{(1+x)^3} - x\right] = \lim\frac{x^4 - x(1 + 3x + 3x^2 + x^3)}{(1+x)^3} = \lim\frac{-3x^3 - 3x^2 - x}{(1+x)^3} = -3$.
> **Odp.:** $x = -1$, ukośna $y = x - 3$ (w $\pm\infty$). (W oficjalnym rozwiązaniu napisano „poziomą”; to literówka, bo jest **ukośna**.)

> [!success]- Rozwiązanie e*)
> **Dziedzina:** $\frac{x^3}{x-1} \ge 0$, $x \ne 1$, czyli $x \le 0$ lub $x > 1$.
> **Pionowa:** $x \to 1^+$: $\frac{1}{0^+} \to \infty$, więc $\sqrt{\infty} = \infty$. Asymptota $x = 1$ **prawostronna** (z lewej nie ma dziedziny).
> **Ukośna w $+\infty$** ($\lvert x\rvert = x$): $\ \sqrt{\frac{x^3}{x-1}} = x\sqrt{\frac{x}{x-1}}$, więc $m = 1$.
> $k = \lim x\left(\sqrt{\tfrac{x}{x-1}} - 1\right)$. Sprzężenie: $\sqrt{\frac{x}{x-1}} - 1 = \dfrac{\frac{x}{x-1} - 1}{\sqrt{\frac{x}{x-1}} + 1} = \dfrac{\frac{1}{x-1}}{\sqrt{\ldots} + 1}$, więc $k = \lim\dfrac{\frac{x}{x-1}}{\sqrt{\ldots} + 1} = \dfrac{1}{2}$.
> **Ukośna w $-\infty$** ($\lvert x\rvert = -x$): wszystko z przeciwnym znakiem: $m = -1$, $k = -\frac12$.
> **Odp.:** $x = 1$ (prawostronna), $y = x + \frac12$ w $+\infty$, $\ y = -x - \frac12$ w $-\infty$.

> [!success]- Rozwiązanie f)
> $D = \mathbb{R}\setminus\{-1, 1\}$. Patrzysz na znak wykładnika $\frac{1}{x^2 - 1}$:
> - $x \to -1^-$ ($\lvert x\rvert > 1$): $x^2 - 1 \to 0^+$, wykładnik $\to +\infty$, więc $e^{+\infty} = \infty$.
> - $x \to -1^+$ ($\lvert x\rvert < 1$): $0^-$, $e^{-\infty} = 0$.
> - $x \to 1^-$: $0$; $\ x \to 1^+$: $\infty$.
> - $x \to \pm\infty$: wykładnik $\to 0$, więc $e^0 = 1$.
>
> **Odp.:** $x = -1$ (lewostronna), $x = 1$ (prawostronna), $y = 1$ (w $\pm\infty$).

> [!success]- Rozwiązanie g)
> **Dziedzina:** $x^2 - 4 > 0$, czyli $x < -2$ lub $x > 2$.
> - $x \to 2^+$: $\left[\frac{-1}{0^+}\right] = -\infty$. $\ x \to -2^-$: $\left[\frac{-5}{0^+}\right] = -\infty$. Pionowe: $x = 2$ (prawostronna), $x = -2$ (lewostronna).
> - $x \to +\infty$: $\frac{x(1 - 3/x)}{\lvert x\rvert\sqrt{1 - 4/x^2}} \to \frac{x}{x} = 1$.
> - $x \to -\infty$: $\lvert x\rvert = -x$, więc $\to \frac{x}{-x} = -1$.
>
> **Odp.:** $x = -2$, $x = 2$, $y = 1$ w $+\infty$, $y = -1$ w $-\infty$.

> [!success]- Rozwiązanie h)
> $D = (0, 2)\cup(2, \infty)$.
> - $x \to 0^+$: $\left[\frac{-\infty}{-2}\right] = +\infty$. Pionowa $x = 0$ prawostronna.
> - $x \to 2^\pm$: $\left[\frac{\ln 2}{0^\pm}\right] = \pm\infty$. Pionowa $x = 2$ obustronna.
> - $x \to \infty$: $\frac{\ln x}{x - 2} \to 0$ (hierarchia: $\ln \prec x$, [[1_Analiza_Matematyczna#7. Hierarchia wzrostu – kto szybciej ucieka do nieskończoności|W1, rozdz. 7]]).
>
> **Odp.:** $x = 0$ (prawostronna), $x = 2$ (obustronna), $y = 0$ w $+\infty$.

> [!success]- Rozwiązanie i)
> $2^x = 3^x$ tylko dla $x = 0$, więc $D = \mathbb{R}\setminus\{0\}$.
> - $x \to 0^+$: $3^x > 2^x$, mianownik $\to 0^-$, licznik $\to 2$, więc $-\infty$. $\ x \to 0^-$: mianownik $\to 0^+$, więc $+\infty$. Pionowa $x = 0$ obustronna.
> - $x \to +\infty$: dzielisz przez $3^x$: $\dfrac{(2/3)^x + 1}{(2/3)^x - 1} \to \dfrac{1}{-1} = -1$.
> - $x \to -\infty$: dzielisz przez $2^x$: $\dfrac{1 + (3/2)^x}{1 - (3/2)^x} \to \dfrac{1}{1} = 1$ (bo $(3/2)^{-\infty} = 0$).
>
> **Odp.:** $x = 0$, $y = -1$ w $+\infty$, $y = 1$ w $-\infty$.

> [!success]- Rozwiązanie i') $x\arctan x$
> Brak pionowych ($D = \mathbb{R}$). W $+\infty$: $m = \lim\operatorname{arctg} x = \frac\pi2$.
> $k = \lim x\left(\operatorname{arctg} x - \frac\pi2\right)$. Dla $x > 0$ zachodzi $\operatorname{arctg} x - \frac\pi2 = -\operatorname{arctg}\frac1x$, więc $k = \lim\left(-\dfrac{\operatorname{arctg}(1/x)}{1/x}\right) = -1$ (bonus z 1.5: $\frac{\operatorname{arctg} t}{t} \to 1$).
> W $-\infty$ symetrycznie: $m = -\frac\pi2$, $k = -1$.
> **Odp.:** $y = \frac\pi2x - 1$ w $+\infty$, $\ y = -\frac\pi2x - 1$ w $-\infty$. (W oficjalnej odpowiedzi ten wynik stoi przy literce „g)”.)

> [!success]- Rozwiązanie j)
> - $-\infty$ (wzór $\frac{x^2}{x-1}$): $m = \lim\frac{x^2}{x(x-1)} = 1$, $\ k = \lim\left(\frac{x^2}{x-1} - x\right) = \lim\frac{x}{x-1} = 1$. Ukośna $y = x + 1$.
> - $1^-$: $\left[\frac{1}{0^-}\right] = -\infty$. Pionowa $x = 1$ lewostronna.
> - $1^+$: $\frac{\ln 1}{1} = 0$, skończona, więc brak.
> - $+\infty$: $\frac{\ln x}{x} \to 0$ (hierarchia). Pozioma $y = 0$.
>
> **Odp.:** $y = x + 1$ w $-\infty$, $x = 1$ lewostronna, $y = 0$ w $+\infty$. (W oficjalnych rozwiązaniach to przykład opisany jako „h)”.)

> [!success]- Rozwiązanie k)
> - $-\infty$: $\frac{e^x}{x - 4} = \left[\frac{0}{-\infty}\right] = 0$. Pozioma $y = 0$.
> - $2^-$: $\frac{e^2}{-2}$, skończona, więc brak. $\ 2^+$: $\frac{12}{0^+} = +\infty$. Pionowa $x = 2$ prawostronna.
> - $+\infty$: stopnie równe, $\to 3$. Pozioma $y = 3$.
>
> **Odp.:** $y = 0$ w $-\infty$, $x = 2$ prawostronna, $y = 3$ w $+\infty$.

> [!success]- Rozwiązanie l)
> **Dziedzina:** $x > 3$ (logarytm) i $e^{x-4} \ne 1$, czyli $x \ne 4$. Więc $D = (3, 4)\cup(4, \infty)$.
> - $3^+$: $\left[\frac{-\infty}{e^{-1} - 1}\right]$, a mianownik jest ujemny, więc $+\infty$. Pionowa $x = 3$ prawostronna.
> - $4^\pm$: $\left[\frac00\right]$. Podstaw $t = x - 4 \to 0$: $\dfrac{\ln(1+t)}{e^t - 1} = \dfrac{\frac{\ln(1+t)}{t}}{\frac{e^t - 1}{t}} \to \dfrac11 = 1$ (bonus z 1.5; w oficjalnym rozwiązaniu robi się to de l'Hospitalem). Skończona, więc **brak** asymptoty.
> - $+\infty$: $\frac{\ln}{\text{wykładnicza}} \to 0$ (hierarchia). Pozioma $y = 0$.
>
> **Odp.:** $x = 3$ (prawostronna), $y = 0$ w $+\infty$.

### Z03 dodatkowe – dla ambitnych

Treść: [[Z03 granice funkcji dodatkowe.pdf]] · Rozwiązania: [[Z03 granice funkcji dodatkowe_Rozwiazania.pdf]]

> [!info] To zadania „dla ambitniejszych studentów”
> Literka „L” przy zadaniu na kartce oznacza zadanie trudniejsze. Warto je zrobić, jeśli celujesz w dobrą ocenę: ćwiczą **rozumienie**, a nie tylko rachunki.

#### Z03d Zadanie 1 – oblicz granice
> [!question] 📝 Treść zadania 1
> **Oblicz (o ile istnieją) granice:**
> a) $\lim\limits_{x\to1}\dfrac{x^2+2x+1}{x^3+1}$ b) $\lim\limits_{x\to3}\dfrac{x^2-10x+21}{x^2-8x+15}$ c) (L) $\lim\limits_{x\to5}\dfrac{x-5}{x^2-3x-10}$ d) $\lim\limits_{x\to1}\dfrac{x^2-2x+1}{x^3-1}$

> [!success]- Rozwiązanie
> a) Wstawiasz: $\frac{4}{2}$. **$= 2$**
> b) Rozpisane w [[#1.4 Typ zero przez zero – skróć albo sprzężenie|1.4]]. **$= 2$**
> c) $x^2 - 3x - 10 = (x-5)(x+2)$, więc $\frac{1}{x+2} \to \frac17$. **$= \dfrac17$**
> d) $\dfrac{(x-1)^2}{(x-1)(x^2+x+1)} = \dfrac{x-1}{x^2+x+1} \to \dfrac03$. **$= 0$**

#### Z03d Zadanie 2 – typ e
> [!question] 📝 Treść zadania 2
> **Granica „typu $e$”:**
> a) $\lim\limits_{x\to0}(1+x)^{1/x}$ b) $\lim\limits_{x\to0}(1-4x)^{1/x}$ c) $\lim\limits_{x\to2}\left(\dfrac{3x+1}{2x+3}\right)^{\frac{3}{2-x}}$
> d) $\lim\limits_{x\to0}(\cos^2 x)^{\frac{1}{\sin^2 x}}$ e) $\lim\limits_{x\to0}(1+\sin x)^{1/x}$ f) $\lim\limits_{x\to2^+}(x-1)^{\frac{1}{2-x}}$

> [!success]- Rozwiązanie
> a) Podstaw $t = \frac1x \to \pm\infty$: $\left(1 + \frac1t\right)^t \to e$. **$= e$**
> b) $(1 + (-4)x)^{1/x} \to e^{-4}$. **$= e^{-4}$**
> c) Podstawa $\to \frac77 = 1$, wykładnik $\to \pm\infty$, więc $1^\infty$. $\ p - 1 = \frac{x-2}{2x+3}$, $\ (p-1)\cdot\frac{3}{2-x} = \frac{-3}{2x+3} \to -\frac37$. **$= e^{-3/7}$**
> d) $\cos^2 x = 1 - \sin^2 x$, $\ t = \sin^2 x \to 0$: $(1 - t)^{1/t} \to e^{-1}$. **$= e^{-1}$**
> e) $\left[(1 + \sin x)^{\frac{1}{\sin x}}\right]^{\frac{\sin x}{x}} \to e^1$. **$= e$**
> f) $x - 1 = 1 - (2 - x)$, $\ t = 2 - x \to 0^-$: $(1 - t)^{1/t} \to e^{-1}$. **$= e^{-1}$**

#### Z03d Zadanie 3 – typ sin x przez x
> [!question] 📝 Treść zadania 3
> **Granica „typu $\frac{\sin x}{x}$”:**
> a) $\lim\limits_{x\to\pi/2}\dfrac{\cos x}{x - \frac\pi2}$ b) $\lim\limits_{x\to0}\dfrac{\sin^2 x}{1 - \cos x}$ c) $\lim\limits_{x\to0}\dfrac{\sin(\sin 2x)}{\sin(\sin x)}$ d) $\lim\limits_{x\to0}\dfrac{\sin(\sin 5x)}{3x}$ e) $\lim\limits_{x\to0}\dfrac{\sin(\sin 5x)}{\sin(2\sin 5x)}$

> [!success]- Rozwiązanie
> a) $\cos x = -\sin\left(x - \frac\pi2\right)$, $\ t = x - \frac\pi2 \to 0$: $\frac{-\sin t}{t} \to -1$. **$= -1$** (W oficjalnym rozwiązaniu jest literówka „$x \to 0$”.)
> b) $\sin^2 x = 1 - \cos^2 x = (1 - \cos x)(1 + \cos x)$, więc $1 + \cos x \to 2$. **$= 2$**
> c) $\sin(\text{małe}) \approx \text{małe}$: $\frac{\sin(\sin 2x)}{\sin(\sin x)} \approx \frac{\sin 2x}{\sin x} \approx \frac{2x}{x}$. Formalnie: mnożysz i dzielisz przez $\sin 2x$ i $\sin x$. **$= 2$**
> d) $\frac{\sin(\sin5x)}{\sin5x}\cdot\frac{\sin 5x}{5x}\cdot\frac{5x}{3x} \to 1\cdot1\cdot\frac53$. **$= \dfrac53$**
> e) $t = \sin 5x \to 0$: $\frac{\sin t}{\sin 2t} \to \frac{t}{2t}$. **$= \dfrac12$**

#### Z03d Zadanie 4 – trzy funkcje
> [!question] 📝 Treść zadania 4
> **„Trzy funkcje”:**
> a) $\lim\limits_{x\to-\infty} e^{x + \sin^2 x}$ b) $\lim\limits_{x\to0}\sqrt x\sin\dfrac{2}{x^2}$ c) $\lim\limits_{x\to0} x^3\operatorname{arctg}\dfrac1x$ d) $\lim\limits_{x\to\infty}\dfrac{2 + \sin x}{x^2}$
> e) $\lim\limits_{x\to0^+}\dfrac{1}{2x - \sin x}$ f) $\lim\limits_{x\to\infty}(\sin x - x^5)$ g) $\lim\limits_{x\to\infty} 2^x(2 + \cos x)$

> [!success]- Rozwiązanie
> a) $0 \le \sin^2 x \le 1$: $\ e^x \le e^{x + \sin^2x} \le e^{x+1}$, oba $\to 0$. **$= 0$**
> b) Tylko $x \to 0^+$ (dziedzina $\sqrt x$): $-\sqrt x \le \cdot \le \sqrt x$, oba $\to 0$. **$= 0$**
> c) $\lvert\operatorname{arctg}\rvert < \frac\pi2$: $-\frac\pi2\lvert x^3\rvert \le \cdot \le \frac\pi2\lvert x^3\rvert$, oba $\to 0$. **$= 0$**
> d) $\frac{1}{x^2} \le \frac{2 + \sin x}{x^2} \le \frac{3}{x^2}$, oba $\to 0$. **$= 0$**
> e) Dla $x > 0$ jest $\sin x \le x$, więc $2x - \sin x \ge x > 0$. Z drugiej strony $\sin x \ge -x$, więc $2x - \sin x \le 3x \to 0$. Mianownik jest dodatni i dąży do zera, czyli $\left[\frac{1}{0^+}\right]$. **$= +\infty$**
> f) $\sin x - x^5 \le 1 - x^5 \to -\infty$ (jeden policjant od góry). **$= -\infty$**
> g) $2 + \cos x \ge 1$, więc $\ge 2^x \to \infty$. **$= \infty$**

#### Z03d Zadanie 5 – granica nie istnieje
> [!question] 📝 Treść zadania 5
> **Wykaż, że następująca granica nie istnieje:**
> a) $\lim\limits_{x\to0}\cos\dfrac{2}{x^2}$ b) (L) $\lim\limits_{x\to\infty}\sin\sqrt x$

> [!success]- Rozwiązanie
> a) Dwa ciągi do zera: $\frac{2}{a_n^2} = 2n\pi$, czyli $a_n = \frac{1}{\sqrt{n\pi}}$, daje $\cos(2n\pi) = 1$. Natomiast $\frac{2}{b_n^2} = \frac\pi2 + n\pi$ daje $\cos\left(\frac\pi2 + n\pi\right) = 0$. $1 \ne 0$, więc **nie istnieje**.
> b) Rozpisane w [[#1.8 Kiedy granica nie istnieje|1.8]]. **Nie istnieje.**

#### Z03d Zadanie 6 – Darboux
> [!question] 📝 Treść zadania 6 (L)
> **Korzystając z twierdzenia Darboux o wartości pośredniej, wykaż, że równanie $x^5 - 3x = 1$ ma co najmniej jeden pierwiastek w przedziale $(1, 2)$.**

> [!success]- Rozwiązanie
> Rozpisane w [[#2.4 Własność Darboux|2.4]]: $f(x) = x^5 - 3x - 1$ jest ciągła, $f(1) = -3 < 0$, $f(2) = 25 > 0$, więc pierwiastek istnieje.

#### Z03d Zadanie 7 – asymptoty z pierwiastkiem trzeciego stopnia
> [!question] 📝 Treść zadania 7
> **Wyznacz asymptoty funkcji:** a) $f(x) = \sqrt[3]{x^3 - x}$ b) $f(x) = \sqrt[3]{x^3 - x^2}$

> [!success]- Rozwiązanie
> Dziedzina $\mathbb{R}$ (pierwiastek nieparzystego stopnia), więc **brak pionowych**.
> **a)** $m = \lim\frac{x\sqrt[3]{1 - 1/x^2}}{x} = 1$. Dla $k$ wzór $a^3 - b^3 = (a - b)(a^2 + ab + b^2)$ z $a = \sqrt[3]{x^3 - x}$, $b = x$:
> $$k = \lim\left(\sqrt[3]{x^3-x} - x\right) = \lim\frac{(x^3 - x) - x^3}{a^2 + ab + b^2} = \lim\frac{-x}{\approx 3x^2} = 0$$
> **Odp.:** ukośna $y = x$ (w $\pm\infty$). (W oficjalnym rozwiązaniu jest literówka „poziomą”.)
> **b)** Tak samo, licznik to $-x^2$: $k = \lim\frac{-x^2}{\approx 3x^2} = -\frac13$. **Odp.:** $y = x - \frac13$.

#### Z03d Zadanie 8 – nierówność
> [!question] 📝 Treść zadania 8 (L)
> **Wykaż, że dla dowolnej liczby rzeczywistej $a$ nierówność $\ a + \ln(4x^2 + 12x + 9) < \ln(4x^2 + 16x + 15)\ $ ma przynajmniej jedno rozwiązanie w przedziale $\left(-\frac32, 0\right)$.**

> [!success]- Rozwiązanie
> $4x^2 + 12x + 9 = (2x+3)^2$ i $4x^2 + 16x + 15 = (2x+3)(2x+5)$. Przenosisz logarytmy na jedną stronę: $a < \ln\frac{(2x+3)(2x+5)}{(2x+3)^2} = \ln\frac{2x+5}{2x+3}$. Nakładasz $e^{\ldots}$ (rosnąca):
> $$e^a < \frac{2x+5}{2x+3} = 1 + \frac{2}{2x+3}$$
> Przy $x \to -\frac32^+$ prawa strona $\to +\infty$, więc przyjmuje **dowolnie duże** wartości, także większe od $e^a$. Rozwiązanie istnieje.

#### Z03d Zadanie 9 – szkice
> [!question] 📝 Treść zadania 9 (L: konstruowanie funkcji)
> **Naszkicuj wykresy funkcji spełniających wszystkie podane warunki:**
> a) $\lim\limits_{x\to-\infty} f = \infty$, $\lim\limits_{x\to0^-} f = 1$, $f(2) = 0$, $\lim\limits_{x\to\infty} f = -1$.
> b) $\lim\limits_{x\to\infty} f = e$, $\lim\limits_{x\to2} f = 0$, funkcja jest parzysta.
> c) prosta $y = x + 1$ jest asymptotą ukośną w $\infty$, prosta $y = x - 1$ asymptotą ukośną w $\infty$ (literówka, chodzi o $-\infty$), a prosta $x = 1$ asymptotą pionową lewostronną. Funkcja nie posiada innych asymptot.
> d) $\lim\limits_{x\to-\infty} f = 0$, $\lim\limits_{x\to0^-} f = -\infty$, $\lim\limits_{x\to0^+} f = 1$, $\lim\limits_{x\to\infty} f = 5$.
> e) $\lim\limits_{x\to1} f = \infty$, $\lim\limits_{x\to2} f = 0$, $f$ jest okresowa z okresem $T = 3$.
> d) (drugie) $\lim\limits_{x\to-\infty} f = 4$, $\lim\limits_{x\to1} f = \infty$, $f$ jest nieparzysta.

> [!success]- Przykładowe rozwiązania (wzory, z których łatwo naszkicować)
> Odpowiedzi nie są jednoznaczne. To **przykłady**; sprawdź każdy warunek.
> a) $f(x) = 1 + x^2$ dla $x < 0$, $\ f(x) = \frac{2 - x}{x + 1}$ dla $x \ge 0$. ($-\infty$: $\infty$ ✓; $0^-$: $1$ ✓; $f(2) = 0$ ✓; $\infty$: $\frac{-x}{x} \to -1$ ✓)
> b) $f(x) = \dfrac{e\,(x^2 - 4)^2}{x^4 + 1}$ (parzysta, bo tylko $x^2$; w $2$ zero; w $\infty$ stopnie równe, $\to e$)
> c) $f(x) = x + \frac2\pi\operatorname{arctg} x + e^{\frac{1}{1-x}} - 1$ (w $+\infty$ $k = 1$, w $-\infty$ $k = -1$; przy $1^-$ $e^{+\infty} = \infty$, przy $1^+$ $e^{-\infty} = 0$)
> d) $f(x) = \frac1x$ dla $x < 0$, $\ f(x) = 5 - 4e^{-x}$ dla $x > 0$
> e) $f(x) = \dfrac{\sin^2\left(\frac{\pi(x-2)}{3}\right)}{\sin^2\left(\frac{\pi(x-1)}{3}\right)}$ (okres 3; w $x = 1$ mianownik $0$, licznik $\frac34$, więc $\infty$; w $x = 2$ licznik $0$)
> d, drugie) $f(x) = -\frac{8}{\pi}\operatorname{arctg} x + \dfrac{x}{(x^2-1)^2}$ (nieparzysta; w $-\infty$: $-\frac8\pi\cdot\left(-\frac\pi2\right) = 4$; w $1$: $\frac{1}{0^+} = \infty$)

#### Z03d Zadanie 10 – wzór z warunków
> [!question] 📝 Treść zadania 10
> **Napisz wzór funkcji spełniającej poniższe warunki i narysuj jej wykres** (rozwiązanie nie jest jednoznaczne; preferowane są wzory jednoczęściowe):
> a) $\lim\limits_{x\to\pm\infty} f = 0$, $\lim\limits_{x\to2^-} f = \infty$, $\lim\limits_{x\to2^+} f = \infty$
> b) $\lim\limits_{x\to\pm\infty} g = 0$, $\lim\limits_{x\to3^-} g = -\infty$, $\lim\limits_{x\to3^+} g = \infty$
> c) $\lim\limits_{x\to-\infty} h_1 = -1$, $\lim\limits_{x\to\infty} h_1 = 1$, $\lim\limits_{x\to0^-} h_1 = -1$, $\lim\limits_{x\to0^+} h_1 = 1$
> d) $\lim\limits_{x\to-\infty} h_2 = -1$, $\lim\limits_{x\to\infty} h_2 = 1$, $\lim\limits_{x\to0^-} h_2 = -\infty$, $\lim\limits_{x\to0^+} h_2 = \infty$
> e) $\lim\limits_{x\to\pm\infty} k = 1$, $\lim\limits_{x\to1^-} k = \infty$, $\lim\limits_{x\to1^+} k = -\infty$
> f) $\lim\limits_{x\to-\infty} f = 3$, $\lim\limits_{x\to-\infty} f = 3$ (pewnie chodzi o $+\infty$), nie istnieje $x_0$, że $f(x_0) = 0$.

> [!success]- Przykładowe rozwiązania
> a) $f(x) = \dfrac{1}{(x-2)^2}$ b) $g(x) = \dfrac{1}{x-3}$ c) $h_1(x) = \dfrac{x}{\lvert x\rvert}$
> d) $h_2(x) = \frac{2}{\pi}\operatorname{arctg} x + \frac1x$ e) $k(x) = 1 - \dfrac{1}{x-1}$ f) $f(x) = 3 + e^{-x^2}$ (zawsze $> 3$, więc nigdy $0$)
>
> **Metoda:** „składaj z klocków”. $\frac{1}{(x-a)^2}$ daje $+\infty$ z obu stron, $\frac{1}{x-a}$ daje różne znaki, $\operatorname{arctg}$ daje różne asymptoty poziome w $\pm\infty$, a dodanie stałej przesuwa wykres w górę.

#### Z03d Zadania 11–20 – pytania teoretyczne
> [!question] 📝 Treść zadań 11–20
> 11. Podaj funkcję $f(x)$, która jest nieciągła w nieskończenie wielu punktach, natomiast w nieskończoności dąży do 6, $\lim\limits_{x\to\infty} f(x) = 6$.
> 12. Podaj wzór funkcji, dla której prosta $x = 7$ jest asymptotą pionową lewostronną (jedyną).
> 13. Podaj wzór funkcji, której jedyną asymptotą jest prosta $y = 1$.
> 14. Podaj przykład funkcji nieokreślonej dla $x_0 = 2$, która nie ma w tym punkcie asymptoty.
> 15. Podaj przykład funkcji, która ma jednocześnie asymptotę pionową i ukośną.
> 16. Czy funkcja może mieć asymptotę pionową w punkcie, który należy do dziedziny? Jeśli tak, podaj przykład.
> 17. Podaj przykład funkcji, której asymptoty poziome prawo- i lewostronna są różne.
> 18. Czy iloraz funkcji $\frac{f(x)}{g(x)}$ może być nieciągły w pewnym punkcie $[0,1]$, gdy obie funkcje $f(x)$ i $g(x)$ są ciągłe dla każdego $x \in [0,1]$? Odpowiedź uzasadnij, np. przykładem.
> 19*. Podaj przykład dwóch funkcji $f$ i $g$, które są ciągłe w punkcie $x = 0$, natomiast ich złożenie $f\circ g$ jest nieciągłe w $x = 0$. Odpowiedź uzasadnij.
> 20. Podaj przykład funkcji, dla której $\lim\limits_{x\to0} f(g(x)) \ne f\left(\lim\limits_{x\to0} g(x)\right)$.

> [!success]- Przykładowe odpowiedzi
> 11. $f(x) = 6 + \dfrac{x - \lfloor x\rfloor}{x^2 + 1}$. $\lfloor x\rfloor$ (część całkowita, z W0) skacze w każdej liczbie całkowitej, a ułamek $\to 0$.
> 12. $f(x) = x^2 + e^{\frac{1}{7-x}}$. Przy $7^-$: $e^{+\infty} = \infty$; przy $7^+$: $e^{-\infty} = 0$. Składnik $x^2$ psuje asymptoty w $\pm\infty$ (rośnie szybciej niż prosta), więc $x = 7$ jest jedyna.
> 13. $f(x) = 1 + e^{-x^2}$ (albo $1 + \frac{1}{x^2+1}$).
> 14. $f(x) = \dfrac{x^2 - 4}{x - 2}$ (dla $x \ne 2$ równa $x + 2$, granica w $2$ wynosi $4$, skończona).
> 15. $f(x) = \dfrac{x^2}{x-1}$: pionowa $x = 1$, ukośna $y = x + 1$ (rysunek w rozdz. 3).
> 16. **Tak.** $f(x) = \frac1x$ dla $x \ne 0$, $f(0) = 0$. Zero należy do dziedziny, a granice jednostronne to $\pm\infty$.
> 17. $\operatorname{arctg} x$: $y = \frac\pi2$ w $+\infty$, $y = -\frac\pi2$ w $-\infty$.
> 18. **Tak**, jeśli $g$ ma miejsce zerowe w $[0,1]$: $\frac{1}{x - 1/2}$ (dla $f = 1$, $g = x - \frac12$) nie jest określony ani ciągły w $\frac12$.
> 19*. $g(x) = x + 1$, $\ f(t) = 0$ dla $t < 1$ i $f(t) = 1$ dla $t \ge 1$. $f$ jest ciągła w $0$ (blisko zera stała), $g$ ciągła wszędzie, ale $f(g(x))$ to $0$ dla $x < 0$ i $1$ dla $x \ge 0$, czyli skok w zerze. Klucz: $f$ ma być nieciągła w punkcie $g(0) \ne 0$.
> 20. $g(x) = x$, $\ f(t) = 1$ dla $t \ne 0$ i $f(0) = 0$. Wtedy $\lim\limits_{x\to0} f(g(x)) = \lim f(x) = 1$, ale $f\left(\lim g\right) = f(0) = 0$. (W oficjalnym rozwiązaniu jest $g(x) = 0$, ale wtedy $f(g(x)) = f(0) = 0$ stale i obie strony wychodzą równe. Potrzebne jest $g(x) \to 0$, ale $g(x) \ne 0$.)

### Z04 – Pochodne

Treść: [[Z04 pochodne.pdf]] · Oficjalne rozwiązania: [[Z04 pochodne_Rozwiazania.pdf]]

> [!tip] Sprawdzaj w WolframAlpha (polecenie z kartki)
> Wpisz `derivative x^4` albo `d/dx (x^4)`. Styczną: `tangent to ln(x^2 + e) at x=0`.

#### Z04 Zadanie 0 – definicja pochodnej
Teoria: [[#4.2 Definicja i oznaczenia|4.2]], [[#7.4 Funkcja złożona – reguła łańcuchowa|7.4]]

> [!question] 📝 Treść zadania 0
> a) $\lim\limits_{x\to\pi/7}\dfrac{\sin x - \sin\frac\pi7}{x - \frac\pi7} = a$. Wyznacz $a$.
> b) Niech $x_0 = 1$ należy do dziedziny $f(x)$. Jeśli $\lim\limits_{x\to1}\dfrac{f(x) - 3}{x - 1} = 3$, wyznacz $f'(1)$.
> c) Znamy wartości funkcji $f(x)$, $y(x)$ oraz wartości ich pochodnych we wskazanych punktach. Wskaż wartość pochodnej $h(x) = f(y(x))$ w $x = 3$.
>
> | $x$ | $f(x)$ | $f'(x)$ | $y(x)$ | $y'(x)$ |
> |---|---|---|---|---|
> | 3 | 1 | 6 | 4 | 5 |
> | 4 | −3 | 5 | 3 | −5 |
> | 5 | 2 | −1 | 3 | 2 |
>
> a. $h'(3) = -1$ b. $h'(3) = 25$ c. $h'(3) = 6$ d. za mało danych

> [!success]- Rozwiązanie a)
> To **definicja** pochodnej $\sin x$ w punkcie $\frac\pi7$ (rozpisane w 4.2). **$a = \cos\dfrac{\pi}{7}$**

> [!success]- Rozwiązanie b)
> Granica jest skończona, a mianownik $\to 0$, więc licznik też: $f(x) \to 3$. Przy ciągłości $f(1) = 3$, a wtedy to jest dokładnie $\lim\frac{f(x) - f(1)}{x - 1}$. **$f'(1) = 3$**

> [!success]- Rozwiązanie c)
> Reguła łańcuchowa: $h'(3) = f'\big(y(3)\big)\cdot y'(3)$.
> - $y(3) = 4$ (wiersz $x = 3$, kolumna $y$),
> - $f'(4) = 5$ (wiersz $x = 4$, kolumna $f'$),
> - $y'(3) = 5$.
>
> $h'(3) = 5\cdot5 = 25$. **Odpowiedź b.**
> **Pułapka:** $f'(3) = 6$ (odp. c) to pochodna zewnętrznej w złym punkcie. Zewnętrzną liczy się w **$y(3)$**, a nie w $3$.

#### Z04 Zadanie 1 – z tablic
Teoria: [[#6. Tablica pochodnych|rozdział 6]]

> [!question] 📝 Treść zadania 1
> **Oblicz pochodne (bezpośrednio z tablic) następujących funkcji:**
> a) $f(x) = x^4$ b) $f(x) = 7$ c) $g(s) = 3s$ d) $h(x) = x^{-7}$ e) $f(t) = \sqrt t$ f) $g(x) = \sqrt[4]{x}$
> g) $f(x) = \sqrt[3]{x^4}$ h) $f(y) = \dfrac1y$ i) $f(y) = \dfrac{1}{x^3}$ j) $f(x) = \dfrac{1}{\sqrt[3]{x^2}}$ k) $f(a) = \dfrac{a}{a^8}$ l) $h(x) = \dfrac{x^4}{\sqrt[3]{x^8}}$

> [!success]- Rozwiązanie a)–f)
> a) $4x^3$ b) $0$ (stała) c) $3$ ($3s = 3s^1$, więc $3\cdot1\cdot s^0$)
> d) $-7x^{-8} = -\dfrac{7}{x^8}$ e) $\left(t^{1/2}\right)' = \frac12t^{-1/2} = \dfrac{1}{2\sqrt t}$
> f) $\left(x^{1/4}\right)' = \frac14x^{-3/4} = \dfrac{1}{4\sqrt[4]{x^3}}$

> [!success]- Rozwiązanie g)–l)
> g) $\left(x^{4/3}\right)' = \frac43x^{1/3} = \frac43\sqrt[3]{x}$
> h) $\left(y^{-1}\right)' = -y^{-2} = -\dfrac{1}{y^2}$
> i) **Pułapka:** zmienna to $y$, a $\frac{1}{x^3}$ jest **stałą** względem $y$. **$f'(y) = 0$**
> j) $\left(x^{-2/3}\right)' = -\frac23x^{-5/3} = -\dfrac{2}{3\sqrt[3]{x^5}}$
> k) $\frac{a}{a^8} = a^{-7}$, więc $-7a^{-8} = -\dfrac{7}{a^8}$
> l) $x^{4 - 8/3} = x^{4/3}$, więc $\frac43\sqrt[3]{x}$

#### Z04 Zadanie 2 – reguły
Teoria: [[#7. Reguły różniczkowania|rozdział 7]]

> [!question] 📝 Treść zadania 2
> **Wyznacz pochodne następujących funkcji** (rozwiązania sprawdź w WolframAlpha):
> a) $f(x) = (x^5 + \sin x)(x + 1)$ b) $f(t) = \dfrac{\ln t}{e^t}$ c) $f(z) = \dfrac{1}{\sqrt[3]{2z} + z^2}$ d) $f(\alpha) = \dfrac{1}{\sqrt[3]{2\alpha} + x\alpha^2}$
> e) $f(x) = \ln(x^3 + \cos x)$ f) $f(z) = \left(1 + \sqrt[3]{z}\right)^3$ g) $f(y) = 5\operatorname{tg}\dfrac y5 + \operatorname{tg}\dfrac\pi8$
> h) $f(x) = \sqrt{x + \sqrt{x + \sqrt x}}$ i) $y = \sin^2\left(\dfrac{1 - \ln x}{x}\right)$ j) $f(t) = \dfrac{\sin 3t}{2\sin^2 t\cos t}$
> k) $f(x) = \dfrac{1}{\sqrt x}e^{x^2 + \ln x + 1}$ l) $f(x) = e^{\sin x}$ m) $f(b) = \dfrac{e^{2b} - \sqrt{b^2 + 2b}}{\ln(b^3 + \sin b)}$

> [!success]- Rozwiązanie a) iloczyn
> $f' = (5x^4 + \cos x)(x + 1) + (x^5 + \sin x)\cdot 1 = 6x^5 + 5x^4 + (x+1)\cos x + \sin x$

> [!success]- Rozwiązanie b) iloraz
> $$f'(t) = \frac{\frac1t e^t - \ln t\cdot e^t}{(e^t)^2} = \frac{\frac1t - \ln t}{e^t}$$
> (skracasz $e^t$)

> [!success]- Rozwiązanie c), d) „jeden przez coś”
> c) $\frac{1}{g}$ ma pochodną $-\frac{g'}{g^2}$ (iloraz z licznikiem stałym, albo $g^{-1}$ i łańcuch). $\left(\sqrt[3]{2z}\right)' = \frac13(2z)^{-2/3}\cdot 2$ (łańcuch!).
> $$f'(z) = -\frac{\frac23(2z)^{-2/3} + 2z}{\left(\sqrt[3]{2z} + z^2\right)^2}$$
> d) Zmienna to $\alpha$, a $x$ jest stałą: $\ f'(\alpha) = -\dfrac{\frac23(2\alpha)^{-2/3} + 2x\alpha}{\left(\sqrt[3]{2\alpha} + x\alpha^2\right)^2}$

> [!success]- Rozwiązanie e), f), g) łańcuch
> e) $\dfrac{3x^2 - \sin x}{x^3 + \cos x}$
> f) $3\left(1 + \sqrt[3]z\right)^2\cdot\frac13z^{-2/3} = \dfrac{\left(1 + \sqrt[3]z\right)^2}{\sqrt[3]{z^2}}$
> g) $5\cdot\dfrac{1}{\cos^2\frac y5}\cdot\dfrac15 + 0 = \dfrac{1}{\cos^2\frac y5}$ ($\operatorname{tg}\frac\pi8$ to stała!)

> [!success]- Rozwiązanie h) łańcuch w łańcuchu
> Zewnętrzny pierwiastek, w środku $x + \sqrt{x + \sqrt x}$, a w nim kolejny pierwiastek:
> $$f'(x) = \frac{1}{2\sqrt{x + \sqrt{x + \sqrt x}}}\cdot\left(1 + \frac{1}{2\sqrt{x + \sqrt x}}\cdot\left(1 + \frac{1}{2\sqrt x}\right)\right)$$

> [!success]- Rozwiązanie i) trzy warstwy
> $u = \frac{1 - \ln x}{x}$, $\ u' = \dfrac{-\frac1x\cdot x - (1 - \ln x)\cdot1}{x^2} = \dfrac{\ln x - 2}{x^2}$.
> $$y' = 2\sin u\cos u\cdot u' = \sin\left(\frac{2(1 - \ln x)}{x}\right)\cdot\frac{\ln x - 2}{x^2}$$
> (użyte $2\sin u\cos u = \sin 2u$)

> [!success]- Rozwiązanie j) najpierw uprość!
> Z iloraz wyjdzie długi wzór. Sprytniej: $\sin 3t = 3\sin t - 4\sin^3 t$, więc
> $$f(t) = \frac{\sin t\,(3 - 4\sin^2t)}{2\sin^2 t\cos t} = \frac{3 - 4\sin^2 t}{2\sin t\cos t} = \frac{1 + 2\cos 2t}{\sin 2t} = \frac{1}{\sin 2t} + 2\operatorname{ctg} 2t$$
> (bo $3 - 4\sin^2 t = 1 + 2\cos 2t$ i $2\sin t\cos t = \sin 2t$). Teraz:
> $$f'(t) = -\frac{2\cos 2t}{\sin^2 2t} - \frac{4}{\sin^2 2t} = -\frac{2\cos 2t + 4}{\sin^2 2t}$$
> (pochodna $\operatorname{ctg}$ to $-\frac{1}{\sin^2}$). Wzorem na iloraz wychodzi to samo, tylko w dłuższej postaci.

> [!success]- Rozwiązanie k), l)
> k) Uprość (rozpisane w 7.3): $f = \sqrt x\,e^{x^2+1}$. Iloczyn:
> $$f' = \frac{1}{2\sqrt x}e^{x^2+1} + \sqrt x\cdot 2x\,e^{x^2+1} = e^{x^2+1}\cdot\frac{1 + 4x^2}{2\sqrt x}$$
> l) $e^{\sin x}\cos x$

> [!success]- Rozwiązanie m) iloraz z łańcuchami
> $N = e^{2b} - \sqrt{b^2 + 2b}$, $\ N' = 2e^{2b} - \dfrac{b + 1}{\sqrt{b^2 + 2b}}$
> $D = \ln(b^3 + \sin b)$, $\ D' = \dfrac{3b^2 + \cos b}{b^3 + \sin b}$
> $$f'(b) = \frac{N'D - ND'}{D^2} = \frac{\left(2e^{2b} - \frac{b+1}{\sqrt{b^2+2b}}\right)\ln(b^3 + \sin b) - \left(e^{2b} - \sqrt{b^2+2b}\right)\frac{3b^2 + \cos b}{b^3 + \sin b}}{\ln^2(b^3 + \sin b)}$$
> **Rada:** przy takich potworach licz $N'$ i $D'$ **osobno** na boku, a dopiero potem wstaw do wzoru.

#### Z04 Zadanie 3 – x w wykładniku
Teoria: [[#8. Pochodna potęgi z x w wykładniku|rozdział 8]]

> [!question] 📝 Treść zadania 3* (wsk.: skorzystaj z równości $t = e^{\ln t}$)
> **Wyznacz pochodne:**
> a) $y = x^x$ b) $y = \sin^x x$ c) $y = x^{\sin x}$ d) $y = \ln(x)^{\ln x}$ e) $f(x) = (\cos^3 x)^{\cot x}e^{2x}$ f) $f(y) = (\cos y)^{1/y}$

> [!success]- Rozwiązanie a)–c)
> a) Rozpisane w rozdz. 8: $x^x(\ln x + 1)$
> b) $(\sin x)^x = e^{x\ln\sin x}$: $\ (\sin x)^x\left(\ln\sin x + x\cdot\dfrac{\cos x}{\sin x}\right) = (\sin x)^x\left(\ln\sin x + x\operatorname{ctg} x\right)$
> c) $x^{\sin x} = e^{\sin x\ln x}$: $\ x^{\sin x}\left(\cos x\ln x + \dfrac{\sin x}{x}\right)$

> [!success]- Rozwiązanie d)
> $(\ln x)^{\ln x} = e^{\ln x\cdot\ln(\ln x)}$. Pochodna wykładnika (iloczyn i łańcuch):
> $$\left(\ln x\cdot\ln\ln x\right)' = \frac1x\ln\ln x + \ln x\cdot\frac{1}{\ln x}\cdot\frac1x = \frac{\ln\ln x + 1}{x}$$
> **$y' = (\ln x)^{\ln x}\cdot\dfrac{\ln(\ln x) + 1}{x}$**

> [!success]- Rozwiązanie e)
> Iloczyn: $\left[(\cos^3x)^{\cot x}\right]'e^{2x} + (\cos^3x)^{\cot x}\cdot2e^{2x}$. Pierwszy nawias: $e^{\cot x\ln(\cos^3x)}$, a pochodna wykładnika:
> $$-\frac{\ln(\cos^3x)}{\sin^2x} + \cot x\cdot\frac{3\cos^2x\cdot(-\sin x)}{\cos^3x} = -\frac{\ln(\cos^3x)}{\sin^2x} - 3$$
> (bo $\cot x\cdot\operatorname{tg} x = 1$). Razem:
> $$f'(x) = (\cos^3x)^{\cot x}e^{2x}\left(-\frac{\ln(\cos^3x)}{\sin^2x} - 3 + 2\right) = -(\cos^3x)^{\cot x}e^{2x}\left(\frac{\ln(\cos^3x)}{\sin^2x} + 1\right)$$

> [!success]- Rozwiązanie f)
> $(\cos y)^{1/y} = e^{\frac{\ln\cos y}{y}}$. Pochodna wykładnika (iloczyn $\ln\cos y\cdot y^{-1}$):
> $$\frac{-\sin y}{\cos y}\cdot\frac1y + \ln\cos y\cdot\left(-\frac{1}{y^2}\right)$$
> **$f'(y) = (\cos y)^{1/y}\left(-\dfrac{\operatorname{tg} y}{y} - \dfrac{\ln\cos y}{y^2}\right)$**

#### Z04 Zadanie 4 – druga pochodna
Teoria: [[#9. Pochodne wyższych rzędów|rozdział 9]]

> [!question] 📝 Treść zadania 4
> **Oblicz $y''$, czyli $\dfrac{d^2y}{dx^2}$:**
> a) $y = x\sqrt{1 + x^2}$ b) $y = e^{(-x^2)}$ c) $y = \dfrac{\arcsin x}{\sqrt{1 - x^2}}$

> [!success]- Rozwiązanie a)
> $y' = \sqrt{1+x^2} + x\cdot\dfrac{2x}{2\sqrt{1+x^2}} = \dfrac{(1 + x^2) + x^2}{\sqrt{1+x^2}} = \dfrac{1 + 2x^2}{\sqrt{1 + x^2}}$
> Iloraz:
> $$y'' = \frac{4x\sqrt{1+x^2} - (1 + 2x^2)\frac{x}{\sqrt{1+x^2}}}{1 + x^2} = \frac{4x(1+x^2) - x(1+2x^2)}{(1+x^2)\sqrt{1+x^2}} = \frac{2x^3 + 3x}{(1+x^2)^{3/2}}$$

> [!success]- Rozwiązanie b)
> $y' = e^{-x^2}\cdot(-2x)$
> $y'' = -2e^{-x^2} + (-2x)\cdot e^{-x^2}(-2x) = e^{-x^2}(4x^2 - 2)$
> (To „krzywa Gaussa”. Druga pochodna zeruje się w $x = \pm\frac{1}{\sqrt2}$, czyli w punktach przegięcia, W4.)

> [!success]- Rozwiązanie c)
> $y' = \dfrac{\frac{1}{\sqrt{1-x^2}}\sqrt{1-x^2} - \arcsin x\cdot\frac{-x}{\sqrt{1-x^2}}}{1 - x^2} = \dfrac{1}{1 - x^2} + \dfrac{x\arcsin x}{(1 - x^2)^{3/2}}$
> Każdy składnik osobno:
> - $\left((1-x^2)^{-1}\right)' = \dfrac{2x}{(1-x^2)^2}$
> - $\left(x\arcsin x\,(1 - x^2)^{-3/2}\right)' = \dfrac{\arcsin x}{(1-x^2)^{3/2}} + \dfrac{x}{(1-x^2)^2} + \dfrac{3x^2\arcsin x}{(1-x^2)^{5/2}}$
>
> Razem:
> $$y'' = \frac{3x}{(1-x^2)^2} + \frac{(1 + 2x^2)\arcsin x}{(1 - x^2)^{5/2}}$$

#### Z04 Zadanie 5 – druga pochodna funkcji złożonej
Teoria: [[#9. Pochodne wyższych rzędów|rozdział 9]] (ramka o funkcji abstrakcyjnej)

> [!question] 📝 Treść zadania 5
> **Niech $f(x)$ będzie dwukrotnie różniczkowalna. Oblicz $y''$:**
> a) $y = f(x^2)$ b) $y = f\left(\dfrac1x\right)$ c) $y = f(\ln x)$
> Wsk.: a) $y' = \left(f(x^2)\right)' = f'(x^2)\cdot2x$.

> [!success]- Rozwiązanie
> a) Rozpisane w rozdz. 9: $\ y'' = 4x^2f''(x^2) + 2f'(x^2)$
> b) $y' = f'\left(\frac1x\right)\cdot\left(-\frac{1}{x^2}\right)$. Iloczyn:
> $$y'' = f''\left(\tfrac1x\right)\cdot\left(-\tfrac{1}{x^2}\right)\cdot\left(-\tfrac{1}{x^2}\right) + f'\left(\tfrac1x\right)\cdot\frac{2}{x^3} = \frac{1}{x^4}f''\left(\tfrac1x\right) + \frac{2}{x^3}f'\left(\tfrac1x\right)$$
> c) $y' = f'(\ln x)\cdot\frac1x$. Iloczyn:
> $$y'' = f''(\ln x)\cdot\frac1x\cdot\frac1x + f'(\ln x)\cdot\left(-\frac{1}{x^2}\right) = \frac{f''(\ln x) - f'(\ln x)}{x^2}$$

#### Z04 Zadanie 6 – styczna
Teoria: [[#10. Styczna i przybliżenie liniowe|rozdział 10]]

> [!question] 📝 Treść zadania 6
> **Wyznacz równanie stycznej do wykresu podanej funkcji $f$ (tzn. liniowe przybliżenie tej funkcji) we wskazanym punkcie:**
> a) $f(x) = \ln(x^2 + e)$ w $(0, f(0))$ b) $f(x) = 2x^2 + 3x - 7$ w $(-1, -8)$ c) $f(x) = x^2 + e^x$ w $(0, 1)$

> [!success]- Rozwiązanie
> a) $f(0) = \ln e = 1$. $\ f'(x) = \frac{2x}{x^2 + e}$, $\ f'(0) = 0$. Styczna pozioma: **$y = 1$**
> b) $f'(x) = 4x + 3$, $\ f'(-1) = -1$. $\ y = -8 - 1\cdot(x + 1)$, czyli **$y = -x - 9$**
> c) $f'(x) = 2x + e^x$, $\ f'(0) = 1$. $\ y = 1 + 1\cdot(x - 0)$, czyli **$y = x + 1$**

#### Z04 Zadanie 7 – styczne do krzywych
Teoria: [[#10. Styczna i przybliżenie liniowe|rozdział 10]]

> [!question] 📝 Treść zadania 7
> a) Napisz równanie stycznej do krzywej $y = x^2 + 2x$ w punkcie $(1; 3)$.
> b) Krzywa $y = \dfrac{1}{1 + x^2}$ jest zwana *Lokiem Agnesi*. Napisz równanie stycznej do tej krzywej w punkcie $\left(-1; \frac12\right)$. Narysuj wykres Loku, korzystając z WolframAlpha.
> c) Krzywa $y = \dfrac{x}{1 + x^2}$ jest zwana *Serpentyną*. Napisz równanie stycznej do tej krzywej w punkcie $(-3; -0{,}3)$. Narysuj wykres Serpentyny, korzystając z WolframAlpha.

> [!success]- Rozwiązanie
> a) Rozpisane w rozdz. 10: **$y = 4x - 1$**
> b) $f'(x) = \left((1+x^2)^{-1}\right)' = -\dfrac{2x}{(1+x^2)^2}$, $\ f'(-1) = \dfrac{2}{4} = \dfrac12$.
> $y = \frac12 + \frac12(x + 1)$, czyli **$y = \dfrac12x + 1$**
> c) Iloraz: $f'(x) = \dfrac{(1 + x^2) - x\cdot2x}{(1+x^2)^2} = \dfrac{1 - x^2}{(1+x^2)^2}$, $\ f'(-3) = \dfrac{-8}{100} = -\dfrac{2}{25}$.
> $y = -0{,}3 - \frac{2}{25}(x + 3)$, czyli **$y = -\dfrac{2}{25}x - \dfrac{27}{50}$**

---

## Granice i pochodne w prawdziwym życiu

| Temat z W2 | Gdzie się przydaje | Przykład |
|---|---|---|
| Ciągłość | **fizyka, programowanie** | brak „teleportacji”; `if` jako funkcja sklejana ([[#2.3 Funkcje sklejane i parametry\|2.3]]) |
| Darboux | **algorytmy** | bisekcja, binary search, `git bisect` ([[#2.4 Własność Darboux\|2.4]]) |
| Asymptota pozioma | **informatyka, fizyka** | prawo Amdahla (limit przyspieszenia), ładowanie baterii ([[#3.4 Przepis na wszystkie asymptoty\|3.4]]) |
| Asymptota pionowa | **sieci, serwery** | czas odpowiedzi przy obciążeniu → 100% |
| Pochodna | **fizyka, ekonomia, AI** | prędkość, koszt krańcowy, gradient ([[#4.4 Interpretacja fizyczna – prędkość\|4.4]]) |
| Reguła łańcuchowa | **uczenie maszynowe** | backpropagation w sieciach neuronowych ([[#7.4 Funkcja złożona – reguła łańcuchowa\|7.4]]) |
| Druga pochodna | **fizyka, ekonomia** | przyspieszenie; „dynamika wzrostu spada” |
| Styczna | **obliczenia, inżynieria** | $\sqrt{4{,}1} \approx 2{,}025$, linearyzacja, $\sin x \approx x$ ([[#10. Styczna i przybliżenie liniowe\|10]]) |

## Ściąga – najważniejsze wzory i zasady

> [!abstract] Na jednej stronie
> **Granica funkcji:** istnieje ⇔ lewa = prawa · przy $x \to -\infty$: $\sqrt{x^2} = -x$ · w punkcie: najpierw wstaw; $\frac{c}{0}$ → znaki z lewej/prawej; $\frac00$ → skróć / sprzężenie / $\frac{\sin}{x}$
>
> **Ważne:** $\frac{\sin x}{x} \to 1$ · $(1 + ax)^{1/x} \to e^a$ · $\frac{\operatorname{tg} t}{t}, \frac{\ln(1+t)}{t}, \frac{e^t - 1}{t} \to 1$ · $\operatorname{arctg}(\pm\infty) = \pm\frac\pi2$
>
> **Ciągłość w $x_0$:** $f(x_0)$ istnieje · granica istnieje · są równe · elementarne ciągłe w dziedzinie · sklejanie: lewa = prawa = wartość · **Darboux:** ciągła i $f(a)f(b) < 0$ ⇒ jest zero w $(a,b)$
>
> **Asymptoty:** pionowa $x = a$: $\lim\limits_{x\to a^\pm} f = \pm\infty$ · pozioma $y = B$: $\lim\limits_{x\to\pm\infty} f = B$ · ukośna $y = mx + k$: $m = \lim\frac{f}{x}$, $k = \lim(f - mx)$ · osobno w $+\infty$ i $-\infty$
>
> **Pochodna:** $f'(a) = \lim\limits_{x\to a}\frac{f(x) - f(a)}{x - a}$ = nachylenie stycznej = tempo zmian · nie istnieje w kątach, szpicach, przy pionowej stycznej i nieciągłości
>
> **Tablica:** $(x^r)' = rx^{r-1}$ · $(e^x)' = e^x$ · $(a^x)' = a^x\ln a$ · $(\ln x)' = \frac1x$ · $(\sin x)' = \cos x$ · $(\cos x)' = -\sin x$ · $(\operatorname{tg} x)' = \frac{1}{\cos^2x}$ · $(\arcsin x)' = \frac{1}{\sqrt{1-x^2}}$ · $(\operatorname{arctg} x)' = \frac{1}{1+x^2}$
>
> **Reguły:** $(fg)' = f'g + fg'$ · $\left(\frac fg\right)' = \frac{f'g - fg'}{g^2}$ · $(f(t(x)))' = f'(t(x))\cdot t'(x)$ · $f^g = e^{g\ln f}$
>
> **Styczna:** $y = f(x_0) + f'(x_0)(x - x_0)$

## Test gotowości

> [!check] Gotowy na W3, jeśli bez zaglądania potrafisz:
> - [ ] policzyć $\lim\limits_{x\to-\infty}\left(\sqrt{x^2 + 2x} + x\right)$
> - [ ] policzyć $\lim\limits_{x\to0}\dfrac{\sin 4x}{\operatorname{tg} 2x}$
> - [ ] dobrać $a$, żeby $f(x) = \begin{cases}x^2 + a, & x < 1\\ 2x + 3, & x \ge 1\end{cases}$ była ciągła
> - [ ] wyznaczyć wszystkie asymptoty $f(x) = \dfrac{2x^2 + 1}{x - 2}$
> - [ ] policzyć z definicji pochodną $f(x) = x^3$ w punkcie $1$
> - [ ] zróżniczkować $e^{x^2}\sin 3x$, $\ \dfrac{\ln x}{x^2}$, $\ \sqrt{1 + \cos^2 x}$
> - [ ] napisać styczną do $y = \ln x$ w punkcie $x_0 = 1$
>
> Odpowiedzi: $-1$ · $2$ · $a = 4$ · $x = 2$, ukośna $y = 2x + 4$ · $3$ · niżej · $y = x - 1$

### Przykłady do przećwiczenia

> [!example] 1. Granice funkcji
> Teoria: [[#1. Granica funkcji – co nowego względem ciągów|rozdział 1]]
> a) $\lim\limits_{x\to-\infty}\left(\sqrt{x^2 + 2x} + x\right)$ b) $\lim\limits_{x\to0}\dfrac{\sin 4x}{\operatorname{tg} 2x}$ c) $\lim\limits_{x\to2}\dfrac{x^3 - 8}{x - 2}$ d) $\lim\limits_{x\to0^-}\dfrac{x + 1}{x^2 + x}$ e) $\lim\limits_{x\to0}(1 + 3x)^{2/x}$
>
> > [!success]- Wyniki
> > a) Sprzężenie: $\frac{2x}{\sqrt{x^2+2x} - x} = \frac{2x}{-x\left(\sqrt{1 + 2/x} + 1\right)} \to \frac{2}{-2} = -1$
> > b) $\frac{4x}{2x} = 2$
> > c) $x^3 - 8 = (x-2)(x^2 + 2x + 4)$, więc $\to 4 + 4 + 4 = 12$
> > d) $\frac{x+1}{x(x+1)} = \frac1x \to -\infty$
> > e) $\left[(1 + 3x)^{1/x}\right]^2 \to (e^3)^2 = e^6$

> [!example] 2. Ciągłość i asymptoty
> Teoria: [[#2. Ciągłość|rozdział 2]], [[#3. Asymptoty|rozdział 3]]
> a) Dobierz $a$: $f(x) = x^2 + a$ dla $x < 1$, $f(x) = 2x + 3$ dla $x \ge 1$.
> b) Asymptoty $f(x) = \dfrac{2x^2 + 1}{x - 2}$.
> c) Asymptoty $f(x) = \dfrac{3x - 1}{x + 4}$.
> d) Asymptoty $f(x) = x\,e^{1/x}$.
>
> > [!success]- Wyniki
> > a) Z lewej $1 + a$, z prawej i w punkcie $5$, więc $a = 4$
> > b) $x = 2$ (obustronna). $m = 2$, $k = \lim\left(\frac{2x^2+1}{x-2} - 2x\right) = \lim\frac{4x + 1}{x - 2} = 4$, więc $y = 2x + 4$
> > c) $x = -4$, $y = 3$
> > d) $x \to 0^+$: $\left[0\cdot e^{+\infty}\right]$, podstaw $t = \frac1x \to \infty$: $\frac{e^t}{t} \to \infty$, więc $x = 0$ prawostronna; $x \to 0^-$: $0\cdot e^{-\infty} = 0$. Ukośna: $m = \lim e^{1/x} = 1$, $k = \lim x\left(e^{1/x} - 1\right) = \lim\frac{e^t - 1}{t} = 1$, więc $y = x + 1$ w $\pm\infty$

> [!example] 3. Pochodne
> Teoria: [[#6. Tablica pochodnych|6]], [[#7. Reguły różniczkowania|7]], [[#8. Pochodna potęgi z x w wykładniku|8]]
> a) $x^3$ z definicji w $1$ b) $e^{x^2}\sin 3x$ c) $\dfrac{\ln x}{x^2}$ d) $\sqrt{1 + \cos^2 x}$ e) $\operatorname{arctg}(x^2)$ f) $x^{\ln x}$
>
> > [!success]- Wyniki
> > a) $\frac{x^3 - 1}{x - 1} = x^2 + x + 1 \to 3$
> > b) $2x\,e^{x^2}\sin 3x + 3e^{x^2}\cos 3x$
> > c) $\frac{\frac1x x^2 - \ln x\cdot 2x}{x^4} = \frac{1 - 2\ln x}{x^3}$
> > d) $\frac{1}{2\sqrt{1 + \cos^2x}}\cdot 2\cos x\cdot(-\sin x) = -\frac{\sin x\cos x}{\sqrt{1 + \cos^2 x}}$
> > e) $\frac{2x}{1 + x^4}$
> > f) $e^{\ln^2 x}$, więc $x^{\ln x}\cdot\frac{2\ln x}{x}$

> [!example] 4. Styczne
> Teoria: [[#10. Styczna i przybliżenie liniowe|10]]
> a) $y = \ln x$ w $x_0 = 1$ b) $y = \sqrt x$ w $x_0 = 9$ c) Oszacuj $\sqrt{9{,}2}$ styczną z b).
>
> > [!success]- Wyniki
> > a) $f(1) = 0$, $f'(1) = 1$, więc $y = x - 1$
> > b) $f(9) = 3$, $f'(9) = \frac16$, więc $y = 3 + \frac16(x - 9) = \frac x6 + \frac32$
> > c) $\sqrt{9{,}2} \approx 3 + \frac{0{,}2}{6} \approx 3{,}0333$ (dokładnie $3{,}0332\ldots$)
