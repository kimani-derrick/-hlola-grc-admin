package o4;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import l4.ExecutorC0976d;
/* loaded from: classes.dex */
public final class i implements K4.b, K4.a {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f12938a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public ArrayDeque f12939b = new ArrayDeque();

    public final synchronized void a(ExecutorC0976d executorC0976d, L4.f fVar) {
        try {
            if (!this.f12938a.containsKey(h4.b.class)) {
                this.f12938a.put(h4.b.class, new ConcurrentHashMap());
            }
            ((ConcurrentHashMap) this.f12938a.get(h4.b.class)).put(fVar, executorC0976d);
        } catch (Throwable th) {
            throw th;
        }
    }
}
