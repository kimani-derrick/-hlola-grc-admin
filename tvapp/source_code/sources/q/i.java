package q;
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public Object f13213a;

    /* renamed from: b  reason: collision with root package name */
    public k f13214b;

    /* renamed from: c  reason: collision with root package name */
    public l f13215c;
    public boolean d;

    public final void finalize() {
        l lVar;
        k kVar = this.f13214b;
        if (kVar != null) {
            j jVar = kVar.f13218r;
            if (!jVar.isDone()) {
                jVar.j(new C1092b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f13213a, 1));
            }
        }
        if (!this.d && (lVar = this.f13215c) != null) {
            lVar.i(null);
        }
    }
}
