package I4;

import java.util.Map;
/* loaded from: classes.dex */
public final /* synthetic */ class a implements G4.d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1253a;

    @Override // G4.a
    public final void a(Object obj, Object obj2) {
        switch (this.f1253a) {
            case 0:
                G4.e eVar = (G4.e) obj2;
                throw new RuntimeException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                G4.e eVar2 = (G4.e) obj2;
                eVar2.e(J4.e.f1428g, entry.getKey());
                eVar2.e(J4.e.f1429h, entry.getValue());
                return;
            default:
                G4.e eVar3 = (G4.e) obj2;
                throw new RuntimeException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}
