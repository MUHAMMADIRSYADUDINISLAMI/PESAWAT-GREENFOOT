import greenfoot.*;

public class burung extends Actor 
{
    public void act() {
        checkCollision();
    }
    
    private void checkCollision() {
        Actor pesawat = getOneIntersectingObject(pesawat.class);
        if (pesawat != null) {
            int pesawatX = pesawat.getX();
            int pesawatY = pesawat.getY();
            World world = getWorld(); // Simpan referensi dunia ke dalam variabel lokal
            if (world != null) { // Periksa apakah dunia masih ada
                world.removeObject(this);
                world.addObject(new Boom(),pesawatX, pesawatY);
            }
        }
    }
}




