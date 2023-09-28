
package Singleton.implementation;

/**
 *
 * @author FA20-BSE-037
 */
public class GameConfig {
    private static GameConfig instance;
    private int graphicsQuality;
    private int soundVolume;
    private String controlScheme;

    private GameConfig() {
        graphicsQuality = 30; 
        soundVolume = 70; 
        controlScheme = "Touchpad";
    }
    public static synchronized GameConfig getInstance() {
        if (instance == null) {
            instance = new GameConfig();
        }
        return instance;
    }
    public int getGraphicsQuality() {
        return graphicsQuality;
    }
    public void setGraphicsQuality(int quality) {
        graphicsQuality = quality;
    }
    public int getSoundVolume() {
        return soundVolume;
    }
    public void setSoundVolume(int volume) {
        soundVolume = volume;
    }
    public String getControlScheme() {
        return controlScheme;
    }
    public void setControlScheme(String scheme) {
        controlScheme = scheme;
    }
    public void displayConfig() {
        System.out.println("Graphics Quality: " + graphicsQuality);
        System.out.println("Sound Volume: " + soundVolume);
        System.out.println("Control Scheme: " + controlScheme);
    }
}

    

