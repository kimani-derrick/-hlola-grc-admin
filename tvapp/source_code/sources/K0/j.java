package K0;

import A5.w;
import java.util.LinkedHashSet;
/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a  reason: collision with root package name */
    public static final LinkedHashSet f1535a;

    static {
        String[] strArr = {"image/jpeg", "image/webp", "image/heic", "image/heif"};
        LinkedHashSet linkedHashSet = new LinkedHashSet(w.J(4));
        for (int i7 = 0; i7 < 4; i7++) {
            linkedHashSet.add(strArr[i7]);
        }
        f1535a = linkedHashSet;
    }
}
