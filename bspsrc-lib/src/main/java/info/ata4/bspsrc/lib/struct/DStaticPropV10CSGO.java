/*
 ** 2012 April 24
 **
 ** The author disclaims copyright to this source code.  In place of
 ** a legal notice, here is a blessing:
 **    May you do good and not evil.
 **    May you find forgiveness for yourself and forgive others.
 **    May you share freely, never taking more than you give.
 */
package info.ata4.bspsrc.lib.struct;

import info.ata4.io.DataReader;
import info.ata4.io.DataWriter;

import java.io.IOException;

/**
 * Old V10 structure found in CS:GO.
 * 
 * @author Nico Bergemann <barracuda415 at yahoo.de>
 */
public class DStaticPropV10CSGO extends DStaticPropV9 {

    protected int flagsEx;

    @Override
    public int getSize() {
        return super.getSize() + 4; // 76
    }

    @Override
    public void read(DataReader in) throws IOException {
        super.read(in);
        flagsEx = in.readInt();
    }

    @Override
    public void write(DataWriter out) throws IOException {
        super.write(out);
        out.writeInt(flagsEx);
    }

    /**
     * @return Always {@code false}, because DStaticPropV10CSGO doesn't use ScreenSpaceFade anymore and its flag is now used for 'RenderInFastReflection'
     */
    @Override
    public boolean hasScreenSpaceFadeInPixels() {
        return false;
    }

    public boolean hasRenderInFastReflection() {
        return super.hasScreenSpaceFadeInPixels();
    }
}
