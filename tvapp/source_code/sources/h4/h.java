package h4;

import g3.n;
/* loaded from: classes.dex */
public abstract class h extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(String str) {
        super(str);
        n.d(str, "Detail message must not be empty");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(String str, Throwable th) {
        super(str, th);
        n.d(str, "Detail message must not be empty");
    }
}
