package game.objects;

public class GameObjects implements Comparable<GameObjects>{
    private String name;
    private int id;
private int [][] comparison={
                      //rock    paper     scissors
        //rock
        {0,-1,1},
        // paper
        {1,0,-1},
        // scissors
        {-1,1,0}
};


    public String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    protected void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return
                "name='" + name
                ;
    }

    @Override
    public int compareTo(GameObjects other) {
        return comparison[id][other.id];
    }

}
