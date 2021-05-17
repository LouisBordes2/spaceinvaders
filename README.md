# spaceinvaders
## Semaine 1 : du 26 Avril au 3 Mai
### Sprints et fonctionnalités réalisées

####Déplacer le vaisseau dans le jeu

- Story 1: Créer l'espace de jeu
Nous avons créer un espace de jeu en deux dimensions.

- Story 2: Positionner un nouveau vaisseau dans l'espace de jeu
Nous avons créer un nouveau vaisseau positionné à des coordonnées données.
On considère que ce vaisseau répresente un seul point. Le vaisseau ne doit pas pouvoir sortir de l'espace de jeu créé. C'est pourquoi un système de position optimisé est important.

- Story 3: Déplacer le vaisseau vers la droite
Le vaisseau de doit pas sortir de l'espace de jeu. Ainsi si le vaisseau se déplace vers la droite et arrive à la limite de l'espace, il doit s'arrêter.

- Story 4: Déplacer le vaisseau vers la gauche
Le vaisseau de doit pas sortir de l'espace de jeu. Ainsi si le vaisseau se déplace vers la gauche et arrive à la limite de l'espace, il doit s'arrêter.

### Fonctionnalités en cours d'implémentation :

Aucune 

### Diagramme de classes 

![M2104](https://user-images.githubusercontent.com/80245495/116818599-86b8ae80-ab6c-11eb-97d4-e1dc0331b984.PNG)

### Nuage de mots du projet spaceinvaders



### Difficultés rencontrées 

Beaucoup d'erreur dans mon code que je n'arrive à résoudre notamment dans les tests.


### Remarques diverses : 

Aucunes


## Semaine 1 : du 26 Avril au 3 Mai
### Sprints et fonctionnalités réalisées

####Déplacer le vaisseau dans le jeu

- Story 1: Positionner un nouveau vaisseau avec une dimension donnée
Le vaisseau n'est plus modélisé comme un point dans l'espace de jeu mais comme une entité avec une dimension.
- Story 2: Faire en sorte qu'il soit impossible de positionner un nouveau vaisseau qui déborde de l'espace de jeu 
Le vaisseau est possède maintenant des dimensions. Cela nous oblige a vérifier en fonction de sa taille qu'il ne déborde pas de l'espace de jeu.
- Story 3: Déplacer un vaisseau vers la droite en tenant compte de sa dimension
Le vaisseau possède maintenant une dimension. On vérifie d'abord qu'il se déplace vers la droite dans l'espace en prenant en compte sa dimension.
- Story 4: Déplacer un vaisseau vers la gauche en tenant compte de sa dimension
Le vaisseau possède maintenant une dimension. On vérifie d'abord qu'il se déplace vers la gauche dans l'espace en prenant en compte sa dimension.


### Fonctionnalités en cours d'implémentation :

Aucune 

### Diagramme de classes 

![M2104](https://user-images.githubusercontent.com/80245495/116818599-86b8ae80-ab6c-11eb-97d4-e1dc0331b984.PNG)

### Nuage de mots du projet spaceinvaders



### Difficultés rencontrées 

Des erreurs dans mes tests que je n'arrive pas à résoudre.


### Remarques diverses : 

Aucunes


## Glossaire

- Vaisseau : Véhicule commandé par le joueur, pouvant se déplacer de droite à gauche et ayant la possibilité de lancer des missiles destinés à détruire les envahisseurs.

- Envahisseur : Ennemi qui apparaît à l'écran, se déplace automatiquement et qui doit être détruit par un missile lancé depuis le vaisseau du joueur.

- Missile : Projectile envoyé à la verticale par le vaisseau vers l'envahisseur dans le but de le détruire

