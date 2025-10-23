package o6;

import java.io.IOException;
import r0.AbstractC1111a;
/* loaded from: classes.dex */
public abstract class u {
    public static int a(int i7, int i8, int i9) {
        if ((i8 & 8) != 0) {
            i7--;
        }
        if (i9 <= i7) {
            return i7 - i9;
        }
        throw new IOException(AbstractC1111a.m(i9, i7, "PROTOCOL_ERROR padding ", " > remaining length "));
    }
}
