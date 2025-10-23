package Y2;

import java.util.Map;
/* renamed from: Y2.w  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0153w implements N3.h {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f4467q;

    @Override // N3.h
    public final boolean apply(Object obj) {
        switch (this.f4467q) {
            case 0:
                if (((String) obj) != null) {
                    return true;
                }
                return false;
            default:
                if (((Map.Entry) obj).getKey() != null) {
                    return true;
                }
                return false;
        }
    }
}
