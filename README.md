<h1 align="center">Progetto MyRestApp</h1>

<p align="center" style="font-family: monospace">Alessandro Stefanucci <a href="https://github.com/LaggoSeeingo">@LaggoSeeingo</a></p>

## Scopo del Progetto
Realizzare un'applicazione Android distribuita che consenta, previa autenticazione, di usufruire di servizi interni ed esterni.
Nello specifico, attraverso l'uso dei bottoni, deve essere possibile: 
1) Cercare informazioni multimediali relative a film, visualizzandole in un elenco dinamico secondo uno schema predefinito
2) Collegarsi ad un sito web


## Activity

### 1. MainActivity
Prima activity che contiene la funzione di login e l'intent alla MenuActivity

Coppie Username/password funzionanti:
- User1/123
- User2/456
- User3/789

#### Dettaglio della funzione valida()
```kotlin
    private fun valida(users: Array<String>, pwds: Array<String>) {
        var user = findViewById<EditText>(R.id.activity_main__txtUsername)
        var userTXT = user.text.toString()
        var pwd = findViewById<EditText>(R.id.activity_main__txtPassword)
        var pwdTXT = pwd.text.toString()

        for(i in users.indices){
                if(users[i].contentEquals(userTXT) && pwds[i].contentEquals(pwdTXT)){
                    val intent = Intent(this, MenuActivity::class.java)
                    var toast = Toast.makeText(this, R.string.toastAccesso, Toast.LENGTH_LONG)
                    toast.show()
                    startActivity(intent)
                    return
                }
            }

            var toast = Toast.makeText(this, R.string.toastNegato, Toast.LENGTH_LONG)
            toast.show()
            user.setText("")
            pwd.setText("")
    }
```
La funzione:
- Riceve come parametri gli array users e pwds, contenenti le coppie User/Password valide
- Recupera i valori inseriti dall'utente negli EditText
- Li confronta con i valori contenuti negli array

In base al riscontro:
- Positivo: Lancia un toast di benvenuto e passa alla MenuActivity
- Negativo: Lancia un toast di errore e resetta gli EditText



### 2. MenuActivity
Activity a cui è possibile accedere dopo essersi autenticati, contiene tre bottoni per accedere alle diverse funzioni:

- Search (Accesso a SearchActivity)
- WebView (Accesso a WebViewActivity)
- Rest (Accesso a RestActivity - non sviluppata)


### 3. SearchActivity con MovieAdapter
Semplice app che fa uso delle API OMDb OMDb per ricercare una lista di film restituita in formato JSON e visualizzata tramite una RecyclerView <p>Credits: <p>Francesco Amendola<a href="https://github.com/amendola-scuola/FilmSearch"> @amendola-scuola</a></p>

### 4. RestActivity
Activity non sviluppata


