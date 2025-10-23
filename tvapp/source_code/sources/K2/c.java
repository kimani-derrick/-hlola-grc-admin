package K2;

import java.util.ArrayList;
/* loaded from: classes.dex */
public final class c implements j {

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f1653b = {8, 13, 11, 2, 0, 1, 7};

    public static void a(int i7, ArrayList arrayList) {
        if (android.support.v4.media.session.b.o0(i7, 0, 7, f1653b) != -1 && !arrayList.contains(Integer.valueOf(i7))) {
            arrayList.add(Integer.valueOf(i7));
        }
    }
}
