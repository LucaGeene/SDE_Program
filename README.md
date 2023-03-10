# SDE_Program
A program written for assignment 3 for SDE.
 #### Gemaakt door: LucaGeene
 
 Dit programma is eigenlijk een klein dungeon-like spelletje. 
 Je maakt je character aan door middel van vragen die gesteld worden. 
 Daarna ga je naar het menu, waar je je informatie kan zien (je progress) van je spel (sessie).
 Als laatst, kan je het spel in, waar je allerlei encounters tegenkomt. Je interact met en vecht tegen deze encounters.
 
 
 ### Design patterns
 Abstract factory (Creational pattern)
 
 De Abstract factory is gebruikt om een combinatie van encounters te maken. Zo is elke ervaring in het spel uniek. 
 Het hoeft alleen een encounter call aan te maken, waarna alle attributes van die encounter (of het een enemy is, een NPC, een item, etc. plus alle details van voorgenoemde) willekeurig aangemaakt worden.
(Helaas is dit niet op tijd gelukt, en dus een WIP. Maar, het staat er wel.)

![Een diagram van logica Abstract factory](Abstract_factory.drawio.png "Diagram Abstract Factory")


Betrokken bestanden:
#### factories
- Encounter
- PositiveEncounter
- NegativeEncounter
#### items
- Item
- NegativeItem
- PositiveItem
#### people
- NegativePerson
- Person
- PositivePerson


Facade (Structural pattern)

Er is een Facade gebruikt voor het versimpelen van de interactie tussen classes en interfaces.

Betrokken bestanden:
- GameFacade


State (Behavioral pattern)

De States zijn gebruikt om de verschillende behaviours van de game gescheiden te houden. Zo kunnen er ook geen verschillende processen door elkaar uitgevoerd worden. 
Afhankelijk van wat de speler wilt, verandert het naar een specifieke State.
Betrokken bestanden:
- CreatorState
- EncounterEndState
- EncounterState
- InfoState
- MenuState
