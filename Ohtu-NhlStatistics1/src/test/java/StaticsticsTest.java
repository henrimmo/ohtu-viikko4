/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import ohtuesimerkki.*;

/**
 *
 * @author henrimmo
 */
public class StaticsticsTest {
    
    Statistics stats;
    Reader readerStub = new Reader() {

        public List<Player> getPlayers() {
            ArrayList<Player> players = new ArrayList<Player>();

            players.add(new Player("Semenko", "EDM", 4, 12));
            players.add(new Player("Lemieux", "PIT", 45, 54));
            players.add(new Player("Kurri",   "EDM", 37, 53));
            players.add(new Player("Yzerman", "DET", 42, 56));
            players.add(new Player("Gretzky", "EDM", 35, 89));

            return players;
        }
    };
    

    @Before
    public void setUp() {
        stats = new Statistics(readerStub);
    }
    

    @Test
    public void playerIsFound() {
        Player player = stats.search("Gretzky");
        assertEquals("Gretzky",player.getName());
    }
    
    @Test
    public void playerNotFound() {
        Player player = stats.search("Kebba");
        assertNull(player);
    }
    
    @Test
    public void teamSizeIsCorrect() {
        List<Player> team = stats.team("PIT");
        assertEquals(1, team.size());
    }
    
    @Test
    public void topScorersCorrect() {
        List<Player> topScorers = stats.topScorers(1);
        assertEquals(2, topScorers.size());
    }
            
}
