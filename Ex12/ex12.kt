data class Item(
    val name: String = "Sword",
    val atk: Int = 6,
    val def: Int = 0
){}

interface Entity{
    val name: String
    var hp: Int
    val atk: Int
    val def: Int
}

class Enemy(
    override val name: String = "Goblin",//Orc
    override var hp: Int = 16,//30
    override val atk: Int = 9,//11
    override val def: Int = 3,//4
    val exp: Int = 75//200
): Entity{
}

class Player(
    override val name: String = "Warrior",
    override var hp: Int = 50,
    override val atk: Int = 10,
    override val def: Int = 5
): Entity{
    var firstItem: Item? = null
    var secondItem: Item? = null
    var points: Int = 0
}

fun fight(p:Player, e:Enemy){
    //var eHp:Int = e.hp
    //var pHp:Int = p.hp
    //println("Enemy has $eHp hp")
    var pAtk:Int = p.atk
    var pDef:Int = p.def

    pAtk += p.firstItem?.atk ?: 0
    pAtk += p.secondItem?.atk ?: 0

    pDef += p.firstItem?.def ?: 0
    pDef += p.secondItem?.def ?: 0
    println("Player attacks with $pAtk and player defense is $pDef");
    println("Start round against ${e.name} with ${e.hp} hp");
    while(e.hp > 0 && p.hp > 0){
        e.hp -= if(pAtk - e.def < e.hp) pAtk - e.def else e.hp
        p.hp -= if(e.atk - pDef < p.hp) e.atk - pDef else p.hp
        
        var eHp:Int = e.hp
        var pHp:Int = p.hp

        println("Enemy has $eHp hp")
        println("Player has $pHp hp")
    }
    if(e.hp <= 0) println("Enemy defeated")
    else println("Player defeated")
    p.points += e.exp
}

fun main(){
    val p = Player()
    p.firstItem = Item("Sword", 6, 0)
    while(p.hp > 0){
        val e = Enemy("Orc", 30, 11, 4, 200)
        fight(p, e)
        println("Player has ${p.hp} hp")
        println("Player has ${p.points} points")
    }
    println("Game over, points: ${p.points}")
}