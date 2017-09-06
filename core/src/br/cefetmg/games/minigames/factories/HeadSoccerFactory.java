package br.cefetmg.games.minigames.factories;

import br.cefetmg.games.minigames.MiniGame;
import br.cefetmg.games.minigames.HeadSoccer;
import br.cefetmg.games.screens.BaseScreen;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Texture;
import java.util.HashMap;
import java.util.Map;
import br.cefetmg.games.minigames.util.MiniGameStateObserver;

/**
 *
 * @author fegemo <coutinho@decom.cefetmg.br>
 */
public class HeadSoccerFactory implements MiniGameFactory {

    /**
     * Veja {@link MiniGameFactory}.
     *
     * @param screen
     * @param observer
     * @param difficulty
     * @return
     */
    @Override
    public MiniGame createMiniGame(BaseScreen screen,
            MiniGameStateObserver observer, float difficulty) {
        return new HeadSoccer(screen, observer, difficulty);
    }

    /**
     * Veja {@link MiniGameFactory}.
     *
     * @return
     */
    @Override
    public Map<String, Class> getAssetsToPreload() {
        return new HashMap<String, Class>() {
            {
                put("head-soccer/Arena.png", Texture.class);
                put("head-soccer/cat.png", Texture.class);
                put("head-soccer/ball.png", Texture.class);
                put("head-soccer/goalLeft.png", Texture.class);
                put("head-soccer/goalRight.png", Texture.class);
            }
        };
    }

}
