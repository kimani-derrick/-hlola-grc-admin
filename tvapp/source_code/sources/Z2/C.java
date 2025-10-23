package Z2;

import android.os.Message;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class C {

    /* renamed from: a  reason: collision with root package name */
    public Message f4595a;

    public final void a() {
        this.f4595a = null;
        ArrayList arrayList = D.f4596b;
        synchronized (arrayList) {
            if (arrayList.size() < 50) {
                arrayList.add(this);
            }
        }
    }

    public final void b() {
        Message message = this.f4595a;
        message.getClass();
        message.sendToTarget();
        a();
    }
}
