Prompt: Generează codul Java pentru clasa Plata exact conform diagramei UML, utilizând java.util.Date. Adaugă getters, setters și o metodă procesarePlata() care să conțină logică internă de business. La final adaugă o metodă main pentru testare."
Avantaj: AI-ul a generat instantaneu structura clasei, potrivind perfect atributele și constructorul, și a scutit programatorul de scrierea repetitivă a getterilor și setterilor.
Dezavantaj: Fără un prompt extrem de detaliat, AI-ul a avut inițial tendința să genereze o metodă procesarePlata fără nicio logică reală, doar cu un return true, forțând programatorul uman să intervină pentru a scrie validările de business reale și a aduce clasa la o complexitate adecvată.

Promt: generate a java class for a school application, we will have users with an account_id and full_name attribute and can perform the authentification method. They can be students, professors, secretary or IT_administrators. There will also be pay_student_fees class, a subject class, a catalogue class and a grades_borderou class.
It basicly implements the model attached in the image
Avantaj: Copilotul a stiut sa evalueze imaginea ce continea diagrama si sa creeze un set de clase care nu a deviat de la model.
Dezavantaj: Apelul in main e destul de complex, poate fi greu de inteles.