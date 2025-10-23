package q;
/* loaded from: classes.dex */
public final class j extends h {

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ k f13216x;

    public j(k kVar) {
        this.f13216x = kVar;
    }

    @Override // q.h
    public final String g() {
        i iVar = (i) this.f13216x.f13217q.get();
        if (iVar == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + iVar.f13213a + "]";
    }
}
