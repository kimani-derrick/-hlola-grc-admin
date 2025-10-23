package H1;

import X.i;
import java.io.IOException;
/* loaded from: classes.dex */
public final class d extends IOException {
    public /* synthetic */ d(IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(String str, IndexOutOfBoundsException indexOutOfBoundsException, int i7) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(str), indexOutOfBoundsException);
        switch (i7) {
            case i.DOUBLE_FIELD_NUMBER /* 7 */:
                super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(str), indexOutOfBoundsException);
                return;
            default:
                return;
        }
    }
}
