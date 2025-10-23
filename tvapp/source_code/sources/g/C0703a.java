package g;

import android.graphics.drawable.Animatable;
import p6.l;
/* renamed from: g.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0703a extends l {

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ int f10444r;

    /* renamed from: s  reason: collision with root package name */
    public final Animatable f10445s;

    public /* synthetic */ C0703a(Animatable animatable, int i7) {
        this.f10444r = i7;
        this.f10445s = animatable;
    }

    @Override // p6.l
    public final void O() {
        switch (this.f10444r) {
            case 0:
                this.f10445s.start();
                return;
            default:
                ((H0.e) this.f10445s).start();
                return;
        }
    }

    @Override // p6.l
    public final void P() {
        switch (this.f10444r) {
            case 0:
                this.f10445s.stop();
                return;
            default:
                ((H0.e) this.f10445s).stop();
                return;
        }
    }
}
