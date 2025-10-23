package l5;

import android.view.View;
import e5.C0658c;
/* renamed from: l5.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0979c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C0980d f12274a;

    public /* synthetic */ C0979c(C0980d c0980d) {
        this.f12274a = c0980d;
    }

    public void a(View view) {
        C0980d c0980d = this.f12274a;
        boolean S6 = c0980d.f12275a.S();
        C0658c c0658c = c0980d.f12278e;
        if (S6) {
            c0980d.f12279g = true;
            c0658c.d(view);
            c0980d.f12279g = false;
        }
        c0980d.a(view);
        c0658c.a();
    }
}
