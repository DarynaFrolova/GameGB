package com.first.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;

public class Label {
    private final BitmapFont bitmapFont;

    public Label(int size) {
        FreeTypeFontGenerator fontGenerator = new FreeTypeFontGenerator(Gdx.files.internal("ofont.ru_Zametka Parletter.ttf"));
        FreeTypeFontGenerator.FreeTypeFontParameter fontParameter = new FreeTypeFontGenerator.FreeTypeFontParameter();
        fontParameter.size = size;
        fontParameter.characters = "QWERTYUIOPASDFGHJKLZXCVBNMqwertyuiopasdfghjklzxcvbnm;:,.?!@#$%^&*()_+=-0123456789";
        this.bitmapFont = fontGenerator.generateFont(fontParameter);
    }

    public void draw(SpriteBatch batch, String text, int x, int y) {
        bitmapFont.draw(batch, text, x, y + bitmapFont.getLineHeight());
    }
}
