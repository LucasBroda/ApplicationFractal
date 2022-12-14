# Rapport de SAE 2022 sur les Fractals
### Participants :
1. Lucas Broda
2. Lucas Guyot
3. Clement Mahieux  
Nous sommes tous les 3 dans la classe A en 2ᵉ année.

## Implantation des opérations sur les nombres complexes
#### Question 1
J'ai créé une classe NumberComplex et j'ai generé puis redéfinis les methodes toString(),hashcode() et equals() pour qu'ils correspondent à la classe.
#### Question 2
J'ai ajouté une interface IComplex avec différentes méthodes que j'ai redéfinies dans la classe NumberComplex sur laquelle j'ai implementé l'interface.
#### Question 3
Pour continuer j'ai ajouté les méthodes abs() et conjugate() comme méthode grâce à l'implémentation et je les ais, elle aussi, redéfinis afin d'avoir tous les tests corrects et que ma classe soit fonctionnelle.
Lucas Guyot
## Implantation des opérations sur le plan complexe
#### Question 4
J'ai créé une classe Plan qui prend en paramètre la hauteur et largeur du plan avec une fonction asComplex(row, column) qui nous a été donné.
#### Question 5
Pour pouvoir réaliser une translation, j'ai dû adapter mon code pour y intégrer un patron de conception, j'ai donc opté pour un decorateur.
En effet, ici on cherche juste à reproduire la fonction asComplex(row, column) pour venir y ajouter une constante (présente dans le constructeur) ainsi pour appliquer le patron, j'ai créé une interface IPlan qui a comme contenue juste asComplex et une classe qui implemente IPlan nommée PlanAddition avec asComplex modifiée pour y ajouter une constante.
#### Question 6
Pour cette question, on reprend ce qu'il a été fait pour la question 5, j'ai donc créé la classe PlanMultiplication pour venir multiplier le complex souhaiter, tout en utilisant asComplex, le multiplicateur peut être initialisé dans le constructeur.  
Clement Mahieux


## Suites complexes et fractales

### Généralités sur les suites
#### Question 7
Le patron de conception que nous allons utiliser est une stratégie. J'ai opté pour ce patron de conception, car il est dit que l'on doit déterminer les termes de la suite grâce à une formule proposée, qui est propre à la suite.
Ainsi, on doit proposer une structure de code qui sera exploitable pour chacune des suites, c'est donc pour cela que j'ai choisi une stratégie.

J'ai donc créé une interface ISuiteComplexe, avec pour seule méthode une méthode getNext, prenant en paramètre le précédent terme de la suite, qui va nous permettre de déterminer le terme suivant.
Ainsi, pour toute suite, je pourrai utiliser cette méthode pour parcourir les termes de la suite.

J'ai réussi à faire cette déduction car, en cours de QDev, j'avais déjà eu affaire à faire un patron de conception de type stratégie, je n'ai donc eu aucun doute par rapport à cela.



#### Question 8
Pour cette question, j'ai utilisé le patron de conception Itérateur, en effet, celui-ci a pour but de parcourir une liste d'objets, de plus, les méthodes de l'itérateur sont déjà comprises dans le package java.util.
On peut retrouver dans ce package :
1. la méthode next(), nous permettant de parcourir les termes d'une suite, elle vérifie s'il y a un terme suivant, puis elle se positionne sur le terme suivant et l'affiche en fonction du terme précèdent.
2. la méthode hasNext(), permettant de vérifier si la suite possède un terme suivant, elle renvoie un boolean, tant que le nombre d'itérations n'est pas égal au nombre d'itérations max, cela veut dire qu'il y a un terme suivant, elle renvoie donc true, si c'est l'inverse, on renvoie false, ou sinon, quand le module du nombre complexe actuel de la suite dépasse 2, on renvoie également false.

Ici, on utilisera seulement ces deux méthodes, car elles sont les seules qui vont nous être réellement utiles.
On va donc créer une classe Iterateur, dans laquelle on va déclarer tous les attributs nécessaires pour faire nos méthodes, un constructeur ainsi que l'implémentation des deux méthodes que j'ai citées avant.

Avant, pour pouvoir itérer une suite, nous devons juste créer une méthode Iterator, nous permettant de créer un itérateur de la suite courante.

J'ai eu des difficultés pour comprendre comment marchait l'implémentation de l'itérateur, quoi faire, quelles méthodes créer, dans quelle classe les créer etc ...

(Clement Mahieux) update de l'itérateur : j'ai créé un getter pour pouvoir avoir accès au nombre d'iteration via à une autre classe, de plus j'ai pû supprimer du constructeur le paramètre précèdent, car il causait certains problèmes lors de l'affichage des suites. Egalement lors de la création d'un nouvel itérateur, parce qu'on devait mettre le premier terme, mais cela n'était pas possible, j'ai donc modifié certaines fonctions, comme hasNext qui renvoie un boolean s'il y a un suivant.
#### Question 9
Ici, j'ai donc créé une classe SuiteJulia, où j'ai créé un attribut c, représentant la constante de la formule, une variable z, qui elle, va varier au fur et à mesure de la suite, et en fonction de la valeur précédente, puis un attribut permettant de représenter le nombre maximum d'itérations de la suite.
On fait également un constructeur, et on implémente la fonction getNext() de notre interface pour parcourir notre suite avec la formule représentant cette suite.
Ensuite on crée un itérateur pour notre suite.

Je n'ai pas eu de difficulté pour cette question, j'ai juste oublié de mettre l'itérateur dans la classe.

(Clement Mahieux) update de Julia : j'ai modifié julia pour qu'elle contienne un itérateur avec ses paramètres et j'ai dû modifier getNext() pour que la fonction fonctionne lorsqu'il y a un terme null.
#### Question 10
Comme pour la question précédente, on crée une classe représentant la suite de Mandelbrot, on reprend la même structure, sauf que ici nous n'avons pas de constante c, le reste est similaire, on adapte juste la méthode getNext() avec la formule correspondante.

Comme la suite de Julia, j'avais oublié d'intégrer un itérateur dans ma classe 

(Clement Mahieux) update de Julia : j'ai modifié julia pour qu'elle contienne un itérateur avec ses paramètres et j'ai dû modifier getNext pour que la fonction fonctionne lorsqu'il y a un terme null.
#### Question 11
Pour faire la suite de Julia de manière généralisée, je reprends la même structure que ma suite de Julia, et je l'adapte pour répondre à la question, pour permettre de représenter la suite de Julia avec n'importe quelle formule, j'utilise un BinaryOperator qui va me permettre de créer une expression lambda avec mes attributs z et c, et de pouvoir les manipuler comme je le souhaite, le changement de formule se fera lors de la déclaration de l'expression.

On adapte également la méthode getNext() pour qu'elle comprenne le BinaryOperator créé, ici, à la place de la formule de la suite, on retournera juste la ligne op.apply(z, c), ce qui veut dire que le BinaryOperator va utiliser les attributs z et c.

On intègre toujours notre itérateur de la même manière.
#### Question 12
La structure reste la même pour la suite généralisée de Mandelbrot, on enlèvera juste l'attribut c.
Lucas Broda


## Choix des couleurs

# Question 13
Pour les différentes palettes de couleurs, j'ai choisi d'utiliser le patron de conception stratégie.
En effet, on va utiliser différentes palettes qui auront le même squelette(même fonction) mais le contenu sera different, car on aura différentes couleurs.

J'ai donc créé une interface ICouleur qui regroupe toutes les fonctions présentent dans les différentes palettes de couleur, j'ai ensuite pû implementer les fonctions dans les classes en définissant les couleurs qu'il fallait, de plus on va définir directement dans les classes de palette les couleurs que prendront les itérations.

En effet, on aura deux paramètres à prendre en compte lors de la creation d'une couleur : 
1. le nombre d'itérations de la suite, ainsi que le nombre max d'itérations qui sera permis à la suite, si ces deux nombres sont égaux, alors on va retourner la couleur de la palette au plus blanc, sinon l'intensité de la couleur sera définie.
# Question 14
Pour le masque, il faut utiliser un Decorateur en effet on veut modifier la couleur actuelle, on aura donc ici une classe abstract contenant les différentes fonctions qui vont être utiles lors de la création des classes masque.

D'ailleurs en créant les classes contenant les masques soit masqueR, masqueG et masqueB on aura la creation d'une couleur dans cette class qui va récupérer les couleurs de la couleur qui doit être modifiée et une fonction masque qui va permettre de retirer la couleur qui correspond au masque.

Clement Mahieux

## Suites chaotiques et diagrammes de bifurcation
#### Question 15
Ici, pour représenter un point du plan, on va utiliser le patron de conception Adaptateur, car on veut faire le lien entre deux classes, ici notre interface IPoint et la classe NumberComplex.

On crée d'abord notre interface IPoint, on crée deux méthodes getX() et getY(), qui vont permettre de récupérer l'abscisse et l'ordonnée de notre point, une méthode distance() qui permet de calculer la distance entre deux points, et enfin, une méthode conversion nous permettant de convertir un point en un objet de type IComplex.

Puis on crée notre adaptateur, d'abord, on crée un attribut de type NumberComplex, avec son constructeur associé. Ensuite on implémente les méthodes getX() et getY(), pour l'abscisse, on prendra la partie réelle du nombre complex, et pour l'ordonnée, sa partie imaginaire.
Ensuite, on implémente notre méthode distance, en retournant la formule de la distance entre deux points.
#### Question 16
Pour convertir un point en objet de type IComplex, on a juste à créer un nouveau NumberComplex avec les coordonnées de notre point (son getX() et son getY()).

### Suites chaotiques

#### Question 17
Comme pour les suites complexes, nous allons créer une interface, ici ISuiteChaotique, avec pour seule méthode une méthode getNext(), qui prend en paramètre un point de type IPoint

Ainsi, comme pour les suites complexes, on a quelque chose d'exploitable pour n'importe quelle suite chaotique.
#### Question 18
On crée tout d'abord une classe AttracteurFeigenbaum, qui implémente notre interface ISuiteChaotique, ensuite on adapte notre méthode getNext() avec la formule donnée pour calculer Feigenbaum.
#### Question 19
Pour la suite circulaire, on fait la même chose que pour Feigenbaum, sauf qu'on remplace dans le getNext() par la formule pour calculer les termes d'une suite circulaire.
#### Question 20
Ici, on doit refaire un itérateur, mais cette fois-ci, pour les suites chaotiques.
Je n'ai pas eu de difficultés cette fois-ci, car j'avais compris comment faire un itérateur grâce aux questions précédentes.


Lucas Broda

### Diagramme de bifurcation

#### Question 21
On doit se rendre pour cette question dans notre classe Plan et rajouter deux méthodes, une pour les nombres complexes, une pour les points.
Pour les deux méthodes, en prendra respectivement en paramètre, un NumberComplex, et un point de type IPoint, et on vérifiera avec un if, si le point ou le nombre complexe se trouver en dehors de l'image.
Si c'est le cas, on retournera un message d'erreur, sinon on donnera les coordonnées du nombre complex ou du point.

J'ai juste des difficultés à trouver comment utiliser les dimensions du plan/image pour vérifier que les points/nombres complexes ne se trouvaient pas en dehors de l'image/plan.

Pour m'aider, j'ai regardé mon projet SpaceInvader, dans la classe Alien, pour récupérer les bordures de notre jeu.
#### Question 22
#### Question 23

Lucas Broda

## Création d’images en Java

#### Question 24
Pour pouvoir créer une image, on va utiliser un Builder.
En effet, je vais donc créer une interface qui contiendra toutes les fonctions pour fabriquer un builder, soit tous les setters des paramètres et la fonction getResult() qui permet de construire le tout.
#### Question 25
On va ici utiliser le code donné pour pouvoir créer des images qui afficheront les différentes fractals.

## Génération des images

#### Question 26
Pour pouvoir créer une image, on va utiliser un Builder.
En effet, je vais donc créer une interface qui contiendra toutes les fonctions pour fabriquer un builder soit tous les setters des paramètres et la fonction getResult() qui permet de construire le tout.
#### Question 27
1. On va créer un nouveau plan de la taille demandé, soit avec height et width(qu'on aura défini grâce à leurs secteurs).
2. On va créer des boucles qui feront un balayage de tous les points sur le plan et à chaque nouveau point, on va créer son complex lui correspondant, et on va générer une suite (qu'on aura choisi grâce au setter)ainsi que l'itérateur de cette suite puis on va chercher à compter le nombre d'iteration que cette suite aura, via un while.
3. Puis avec le résultat précèdent, on va définir la couleur qui lui correspond, en prenant en compte le nombre d'itérations de la suite et le nombre d'itérations max qu'on pourra avoir (lui aussi définis grace au secteur).
4. On va donc utiliser ici le secteur de couleur d'un pixel et le définissant comme la couleur générer juste au-dessus.
5. On sauvegarde l'image grâce à la fonction saveAs() donnée précédemment.


Clement Mahieux

## Figures et transformations géométriques

### Représentation des différentes figures

#### Question 28
J'ai créé les classes pour les différentes figures dont on aura besoin par la suite et ces classes implémentent toutes l'interface IFigure avec la méthode getSVG() que j'ai redéfini dans chaque classe.
#### Question 29
J'ai utilisé un Décorateur en tant que patron de conception afin de gérer plus facilement mes transformations de figures pour cela j'ai créé une classe abstraite Transformation qui sera extends par deux classes Rotate et Translate qui redéfinissent la méthode getSVG() afin qu'elle s'adapte aux changements.
#### Question 30
J'ai utilisé un Composite en tant que patron de conception pour pouvoir créer des fractales qui utilisent plusieurs figures géométriques. J'ai créé une interface IForme avec plusieurs méthodes qui seront redéfinis dans ma classe abstraite BaseForme puis je l'ai extends dans les classes de mes différentes figures.

Lucas Guyot

## Construction de fractales à partir de figures géométriques

#### Question 31

## Quelques fractales à base de figures géométriques

#### Question 32

#### Question 33

#### Question 34

#### Question 35

#### Question 36

## Génération des fractales

#### Question 37

## La classe principale

#### Question 38
Ici, nous devons modifier la classe Fractal et ajouter un corp a la fonction buildFractal() .
Dans cette fonction, on va donc avoir notre Builder d'image (les images sont la représentation graphique de nos fractals).

On va donc créer une instance de builder et on va lui donner à l'aide des secteurs(du builder) les paramètres que nous souhaitons, c'est-à-dire la taille de l'image du fractal que nous voulons voir, ainsi que la couleur à utiliser.
#### Question 39
Ici, je suis allé dans la run configuration de Gradle pour pouvoir y ajouter une nouvelle configuration : run --args="-f Julia -w 100 -h 100 -n 100 -o image.png -p "grey" -s 1 -x 50 -y 50".

Celle si contient tous les paramètres pour le builder avec la lettre la concernant, suivis de son paramètre.

Clement Mahieux

## Scripts de lancement

#### Question 40
#### Question 41
#### Question 42
#### Question 43


# Fin Du Rapport
Merci pour votre lecture 