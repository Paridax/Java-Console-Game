package utils;

public class Entity 
{
    public int health = 100;
    public int shield = 100;
    public int strength = 0;
    public double crit_chance = 0.10;
    public double crit_percent = 0.15; 

    public int updateHealth(int mod, Boolean exact) {
        if (exact) {
            health = mod;
            return health;
        }
        health += mod;
        return health;
    }
}
