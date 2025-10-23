package androidx.leanback.widget;

import android.graphics.Color;
/* loaded from: classes.dex */
public final class t0 {

    /* renamed from: a  reason: collision with root package name */
    public final int f6653a;

    /* renamed from: b  reason: collision with root package name */
    public final int f6654b;

    /* renamed from: c  reason: collision with root package name */
    public final int f6655c;

    public t0(int i7, int i8, int i9) {
        this.f6653a = i7;
        if (i8 == i7) {
            i8 = Color.argb((int) ((Color.alpha(i7) * 0.85f) + 38.25f), (int) ((Color.red(i7) * 0.85f) + 38.25f), (int) ((Color.green(i7) * 0.85f) + 38.25f), (int) ((Color.blue(i7) * 0.85f) + 38.25f));
        }
        this.f6654b = i8;
        this.f6655c = i9;
    }
}
