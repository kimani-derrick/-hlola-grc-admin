package androidx.leanback.widget;
/* loaded from: classes.dex */
public final class M0 extends O0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TitleView f6423a;

    public M0(TitleView titleView) {
        this.f6423a = titleView;
    }

    @Override // androidx.leanback.widget.O0
    public final void a(boolean z7) {
        boolean z8;
        SearchOrbView searchOrbView = this.f6423a.f6559s;
        if (z7 && searchOrbView.hasFocus()) {
            z8 = true;
        } else {
            z8 = false;
        }
        searchOrbView.f6516C = z8;
        searchOrbView.b();
    }
}
