package n1;

import c.InterfaceC0385a;
import com.boxhdo.android.tv.ui.activity.main.TvActivity;
import com.boxhdo.android.tv.ui.activity.player.TvPlayerActivity;
import o1.w;
/* renamed from: n1.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1026a implements InterfaceC0385a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f12618a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ q1.g f12619b;

    public /* synthetic */ C1026a(q1.g gVar, int i7) {
        this.f12618a = i7;
        this.f12619b = gVar;
    }

    @Override // c.InterfaceC0385a
    public final void a() {
        switch (this.f12618a) {
            case 0:
                TvActivity tvActivity = (TvActivity) this.f12619b;
                if (!tvActivity.f7790S) {
                    tvActivity.f7790S = true;
                    ((q) tvActivity.k()).getClass();
                    return;
                }
                return;
            default:
                TvPlayerActivity tvPlayerActivity = (TvPlayerActivity) this.f12619b;
                if (!tvPlayerActivity.f7797S) {
                    tvPlayerActivity.f7797S = true;
                    ((w) tvPlayerActivity.k()).getClass();
                    return;
                }
                return;
        }
    }
}
