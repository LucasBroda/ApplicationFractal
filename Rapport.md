# Rapport de SAE 2022 sur les Factals
### Participants :
1. Lucas Broda
2. Lucas Guyot
3. Clement Mahieux  
Nous sommes tous les 3 dans la classe A en 2eme année.

## Implantation des opérations sur les nombres complexes
#### Question 1
#### Question 2
#### Question 3
Lucas Guyot
## Implantation des opérations sur le plan complexe
#### Question 4
J'ai créé une classe Plan qui prend en paramètre la hauteur et largeur du plan avec une fonction asComplex(row,column) qui nous a été donné.
#### Question 5
Pour pouvoir réaliser une translation, j'ai dû adapter mon code pour y intégrer un patron de conception, j'ai donc opté pour un decorateur.
En effet, ici on cherche juste à reproduire la fonction asComplex(row,column) pour venir y ajouter une constante (présente dans le constructaur) ainsi pour appliquer le patron, j'ai créé une interface IPlan qui a comme contenue juste asComplex et une classe qui implemente IPlan nommée PlanAddition avec asComplex modifiée pour y ajouter une constante.
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

(Clement Mahieux) update de l'itérateur : j'ai créé un getter pour pouvoir avoir accès au nombre d'iteration via à une autre classe, de plus j'ai pû supprimer du constructeur le paramètre précèdent, car il causait certains problèmes lors de l'affichage des suites. Egalement lors de la création d'un nouvel itérateur, car on devait mettre le premier terme, mais cela n'était pas possible, j'ai donc modifié certaines fonctions, comme hasNext qui renvoie un boolean s'il y a un suivant.
#### Question 9
Ici, j'ai donc créé une classe SuiteJulia, où j'ai créé un attribut c, représentant la constante de la formule, une variable z, qui elle, va varier au fur et à mesure de la suite, et en fonction de la valeur précédente, puis un attribut permettant de représenter le nombre maximun d'itérations de la suite.
On fait donc également un constructeur, et on implémente la fonction getNext() de notre interface pour parcourir notre suite avec la formule représentant cette suite.
Puis on crée un itérateur pour notre suite.

Je n'ai pas eu de difficulté pour cette question, j'ai juste oublié de mettre l'itérateur dans la classe.

(Clement Mahieux) update de Julia : j'ai modifié julia pour qu'elle contienne un itérateur avec ses paramètres et j'ai dû modifier getNext() pour que la fonction fonctionne lorsqu'il y a un terme null.
#### Question 10
Comme pour la question précédente, on crée une classe représentant la suite de Mandelbrot, on reprend la même structure, sauf que ici nous n'avons pas de constante c, le reste est similaire, on adapte juste la méthode getNext() avec la formule correspondate.

Comme la suite de Julia, j'avais oublié d'intégrer un itérateur dans ma classe 

(Clement Mahieux) update de Julia : j'ai modifié julia pour qu'elle contienne un itérateur avec ses paramètres et j'ai dû modifier getNext pour que la fonction fonctionne lorsqu'il y a un terme null.
#### Question 11
Pour faire la suite de Julia de manière généralisée, je reprends la même structure que ma suite de Julia, et je l'adapte pour répondre à la question, pour permettre de représenter la suite de Julia avec n'importe quelle formule, j'utilise un BinaryOperator qui va me permettre de créer une expression lambda avec mes attributs z et c, et de pouvoir les manipuler comme je le souhaite, le changement de formule se fera lors de la déclaration de l'expression.

On adapte également la méthode getNext() pour qu'elle comprenne le BinaryOperator créé, ici, à la place de la formule de la suite, on retournera juste la ligne op.apply(z,c), ce qui veut dire que le BinaryOperator va utiliser les attributs z et c.

On intègre toujours notre itérateur de la même manière.
#### Question 12
La structure reste la même pour la suite généralisée de Mandelbrot, on enlèvera juste l'attribut c.
Lucas Broda


## Choix des couleurs

# Question 13
Pour les différentes palettes de couleurs, j'ai choisi d'utiliser le patron de conception stratégie.
En effet, on va utiliser différentes palettes qui auront le même squelette(même fonction) mais le contenue sera different, car on aura différentes couleurs.

J'ai donc créé une interface ICouleur qui regroupe toutes les fonctions présentent dans les différentes palettes de couleur, j'ai ensuite pû implementer les fonctions dans les classes en définissant les couleurs qu'il fallait, de plus on va définir directement dans les classes de palette les couleurs que prendront les itérations.

En effet, on aura deux paramètres à prendre en compte lors de la creation d'une couleur : 
1. le nombre d'itérations de la suite, ainsi que le nombre max d'itérations qui sera permis à la suite, si ces deux nombres sont égaux, alors on va retourner la couleur de la palette au plus blanc, sinon l'intensité de la couleur sera définie.
# Question 14
Pour le masque, il faut utiliser un Decorateur en effet on veut modifier la couleur actuelle, on aura donc ici une classe abstract contenant les différentes fonctions qui vont être utiles lors de la création des classes masque.

D'ailleurs en créant les classes contenant les masques soit masqueR, masqueG et masqueB on aura la creation d'une couleur dans cette class qui va récupérer les couleurs de la couleur qui doit être modifiée et une fonction masque qui va permettre de retirer la couleur qui correspond au masque.

Clement Mahieux

## Suites chaotiques et diagrammes de bifurcation
#### Question 15
#### Question 16

### Suites chaotiques

#### Question 17
#### Question 18
#### Question 19
#### Question 20

### Diagramme de bifurcation

#### Question 21
#### Question 22
#### Question 23

## Création d’images en Java

#### Question 24
pour pouvoir crée une image on va utiliser un Builder en effet je vais donc crée une interface qui contiendra tutes les fonction pour fabriquer un builder soit tout les seter des paramètres et la fonction getResult() qui permet de construir le tout
#### Question 25
on va ici utiliser le code donné pour pouvoir crée des images en png qui afficheron les differents fractals donc

## Génération des images

#### Question 26
pour pouvoir crée une image on va utiliser un Builder en effet je vais donc crée une interface qui contiendra tutes les fonction pour fabriquer un builder soit tout les seter des paramètres et la fonction getResult() qui permet de construir le tout
#### Question 27
1. on va crée un nouveau plan de la taille demandé soir avec height et witght(qu'on aura defini grace a leurs seteurs)
2. on va crée des boucle qui feron un balayage de tout les point sur le plan et a chaque nouveaux points on va crée son complex lui corresondant et on va generer une suite (qu'on aura choisis grace au seter)ainci que l'iterateur de cette suite puis on va chercher a compter le nombre d'iteration que cette suite auras on va donc les compter grace a l'iterator de la suite avec un while
3. Puis avec le resultat précedent on va définir la couleur qui lui correspond en prenant en compte le nombre d'iteration de la suite et le nnombre d'iteration max qu'on pouras avoir (lui aussi definis grace au seteur)
4. on va donc utiliser ici le seteur de couleur d'un pixel et le la definisant comme la couleur générer juste au dessus
5. on sauvegarde l'image grace a la fonction  saveAs() donnée précedament


Clement Mahieux

## La classe principale

#### Question 38
ici nous devon modifier la class Fractas et ajouter un corp a la fonction buildFractal() dans cette fonction on va donc avoir notre Builder d'image (les image sont la représentation graphique de nos phractales) on va donc crée une instance de builder et on va lui donné a laide des seteurs(du builder) les paramètres que ous souhaiton c'est a dire la taille de l'image le fractal que nous voulon voir la couleur a utiliser...
#### Question 39
ici je suis alle dans le run configuration de Gradle pour pouvoir y ajouer une nouvelle configuration : run --args="-f Julia -w 100 -h 100 -n 100 -o image.png -p "grey" -s 1 -x 50 -y 50" celle si contier tout les paramètres pour le builder avec -la letre la conernat et suivis de son paramètre

Clement Mahieux

## Scripts de lancement

#### Question 40
#### Question 41
#### Question 42
#### Question 43


# Fin Dun Raport
merci de votre lecture 