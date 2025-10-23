package S0;

import A5.w;
import java.util.LinkedHashMap;
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashMap f3054a;

    public l(int i7) {
        switch (i7) {
            case 2:
                this.f3054a = new LinkedHashMap();
                return;
            default:
                this.f3054a = new LinkedHashMap(0, 0.75f, true);
                return;
        }
    }

    public l(m mVar) {
        this.f3054a = w.P(mVar.f3056q);
    }
}
