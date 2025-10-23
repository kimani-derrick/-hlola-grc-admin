package Z5;

import H2.U;
import K.O;
import Z2.AbstractC0156a;
import a3.y;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import android.util.SparseArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.appcompat.widget.ActionMenuView;
import androidx.fragment.app.C0271z;
import androidx.fragment.app.H;
import androidx.leanback.app.G;
import androidx.leanback.widget.AbstractC0292g;
import androidx.leanback.widget.C0318v;
import androidx.leanback.widget.C0321y;
import androidx.leanback.widget.InterfaceC0290f;
import androidx.leanback.widget.InterfaceC0296i;
import androidx.leanback.widget.InterfaceC0314r0;
import androidx.leanback.widget.Q;
import androidx.leanback.widget.R0;
import com.google.android.gms.common.api.Scope;
import e5.C0656a;
import e5.C0657b;
import e5.C0658c;
import g2.RunnableC0725p;
import g3.AbstractC0733b;
import g3.C0735d;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import k.C0890h;
import k.InterfaceC0896k;
import k.InterfaceC0899l0;
import k.L0;
import k.V0;
import l5.C0979c;
import l5.C0980d;
import l5.C0983g;
import s3.X0;
import w0.N;
import w0.k0;
import z0.C1499a;
import z5.C1530l;
/* loaded from: classes.dex */
public final class n implements b, a3.q, InterfaceC0290f, InterfaceC0314r0, InterfaceC0296i, b5.o, N, InterfaceC0899l0, j.o, j.h {

    /* renamed from: q  reason: collision with root package name */
    public Object f4918q;

    public n(int i7) {
        switch (i7) {
            case 26:
                TimeUnit timeUnit = TimeUnit.MINUTES;
                M5.g.f(timeUnit, "timeUnit");
                this.f4918q = new l6.l(k6.d.f12220h, timeUnit);
                return;
            default:
                this.f4918q = new I.h();
                return;
        }
    }

    public static c3.a B(D0.c cVar) {
        HashMap hashMap = new HashMap(11);
        hashMap.put("movie_id", new C1499a(0, 1, "movie_id", "INTEGER", null, true));
        hashMap.put("tmdb_id", new C1499a(0, 1, "tmdb_id", "INTEGER", null, true));
        hashMap.put("overview", new C1499a(0, 1, "overview", "TEXT", null, true));
        hashMap.put("title", new C1499a(0, 1, "title", "TEXT", null, true));
        hashMap.put("type", new C1499a(0, 1, "type", "TEXT", null, true));
        hashMap.put("poster_url", new C1499a(0, 1, "poster_url", "TEXT", null, true));
        hashMap.put("backdrop_url", new C1499a(0, 1, "backdrop_url", "TEXT", null, true));
        hashMap.put("release_date", new C1499a(0, 1, "release_date", "TEXT", null, true));
        hashMap.put("countries", new C1499a(0, 1, "countries", "TEXT", null, true));
        hashMap.put("genres", new C1499a(0, 1, "genres", "TEXT", null, true));
        hashMap.put("id", new C1499a(1, 1, "id", "INTEGER", null, false));
        HashSet hashSet = new HashSet(0);
        HashSet hashSet2 = new HashSet(1);
        hashSet2.add(new z0.d("index_tbl_watch_list_movie_id", true, Arrays.asList("movie_id"), Arrays.asList("ASC")));
        z0.e eVar = new z0.e("tbl_watch_list", hashMap, hashSet, hashSet2);
        z0.e a7 = z0.e.a(cVar, "tbl_watch_list");
        if (!eVar.equals(a7)) {
            return new c3.a(false, "tbl_watch_list(com.boxhdo.android.data.model.entity.WatchListEntity).\n Expected:\n" + eVar + "\n Found:\n" + a7);
        }
        HashMap hashMap2 = new HashMap(9);
        hashMap2.put("movie_id", new C1499a(1, 1, "movie_id", "INTEGER", null, true));
        hashMap2.put("title", new C1499a(0, 1, "title", "TEXT", null, true));
        hashMap2.put("type", new C1499a(0, 1, "type", "TEXT", null, true));
        hashMap2.put("poster_url", new C1499a(0, 1, "poster_url", "TEXT", null, true));
        hashMap2.put("backdrop_url", new C1499a(0, 1, "backdrop_url", "TEXT", null, true));
        hashMap2.put("release_date", new C1499a(0, 1, "release_date", "TEXT", null, true));
        hashMap2.put("countries", new C1499a(0, 1, "countries", "TEXT", null, true));
        hashMap2.put("genres", new C1499a(0, 1, "genres", "TEXT", null, true));
        hashMap2.put("view_date", new C1499a(0, 1, "view_date", "TEXT", null, true));
        z0.e eVar2 = new z0.e("tbl_history", hashMap2, new HashSet(0), new HashSet(0));
        z0.e a8 = z0.e.a(cVar, "tbl_history");
        if (!eVar2.equals(a8)) {
            return new c3.a(false, "tbl_history(com.boxhdo.android.data.model.entity.HistoryEntity).\n Expected:\n" + eVar2 + "\n Found:\n" + a8);
        }
        HashMap hashMap3 = new HashMap(13);
        hashMap3.put("movie_id", new C1499a(1, 1, "movie_id", "INTEGER", null, true));
        hashMap3.put("movie_name", new C1499a(0, 1, "movie_name", "TEXT", null, false));
        hashMap3.put("poster_path", new C1499a(0, 1, "poster_path", "TEXT", null, false));
        hashMap3.put("backdrop_path", new C1499a(0, 1, "backdrop_path", "TEXT", null, false));
        hashMap3.put("overview", new C1499a(0, 1, "overview", "TEXT", null, false));
        hashMap3.put("release_date", new C1499a(0, 1, "release_date", "TEXT", null, false));
        hashMap3.put("rating", new C1499a(0, 1, "rating", "REAL", null, false));
        hashMap3.put("episode_id", new C1499a(2, 1, "episode_id", "INTEGER", null, true));
        hashMap3.put("season_number", new C1499a(0, 1, "season_number", "INTEGER", null, false));
        hashMap3.put("episode_number", new C1499a(0, 1, "episode_number", "INTEGER", null, false));
        hashMap3.put("time", new C1499a(0, 1, "time", "INTEGER", null, false));
        hashMap3.put("percent", new C1499a(0, 1, "percent", "REAL", null, false));
        hashMap3.put("tmdb_id", new C1499a(0, 1, "tmdb_id", "INTEGER", null, false));
        z0.e eVar3 = new z0.e("tbl_continue_watch", hashMap3, new HashSet(0), new HashSet(0));
        z0.e a9 = z0.e.a(cVar, "tbl_continue_watch");
        if (!eVar3.equals(a9)) {
            return new c3.a(false, "tbl_continue_watch(com.boxhdo.android.data.model.entity.ContinueWatchEntity).\n Expected:\n" + eVar3 + "\n Found:\n" + a9);
        }
        return new c3.a(true, (String) null);
    }

    public static void p(D0.c cVar) {
        cVar.j("CREATE TABLE IF NOT EXISTS `tbl_watch_list` (`movie_id` INTEGER NOT NULL, `tmdb_id` INTEGER NOT NULL, `overview` TEXT NOT NULL, `title` TEXT NOT NULL, `type` TEXT NOT NULL, `poster_url` TEXT NOT NULL, `backdrop_url` TEXT NOT NULL, `release_date` TEXT NOT NULL, `countries` TEXT NOT NULL, `genres` TEXT NOT NULL, `id` INTEGER PRIMARY KEY AUTOINCREMENT)");
        cVar.j("CREATE UNIQUE INDEX IF NOT EXISTS `index_tbl_watch_list_movie_id` ON `tbl_watch_list` (`movie_id`)");
        cVar.j("CREATE TABLE IF NOT EXISTS `tbl_history` (`movie_id` INTEGER NOT NULL, `title` TEXT NOT NULL, `type` TEXT NOT NULL, `poster_url` TEXT NOT NULL, `backdrop_url` TEXT NOT NULL, `release_date` TEXT NOT NULL, `countries` TEXT NOT NULL, `genres` TEXT NOT NULL, `view_date` TEXT NOT NULL, PRIMARY KEY(`movie_id`))");
        cVar.j("CREATE TABLE IF NOT EXISTS `tbl_continue_watch` (`movie_id` INTEGER NOT NULL, `movie_name` TEXT, `poster_path` TEXT, `backdrop_path` TEXT, `overview` TEXT, `release_date` TEXT, `rating` REAL, `episode_id` INTEGER NOT NULL, `season_number` INTEGER, `episode_number` INTEGER, `time` INTEGER, `percent` REAL, `tmdb_id` INTEGER, PRIMARY KEY(`movie_id`, `episode_id`))");
        cVar.j("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        cVar.j("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '80b29c854ef709a36e0c4f4addeb24c6')");
    }

    public void A(d3.b bVar) {
        if (bVar.f9220r == 0) {
            AbstractC0733b abstractC0733b = (AbstractC0733b) this.f4918q;
            abstractC0733b.getClass();
            Set emptySet = Collections.emptySet();
            Bundle bundle = new Bundle();
            int i7 = d3.d.f9226a;
            Scope[] scopeArr = C0735d.f10782E;
            Bundle bundle2 = new Bundle();
            int i8 = abstractC0733b.f10771p;
            d3.c[] cVarArr = C0735d.F;
            C0735d c0735d = new C0735d(6, i8, i7, null, null, scopeArr, bundle2, null, cVarArr, cVarArr, true, 0, false, null);
            c0735d.f10790t = abstractC0733b.f10760b.getPackageName();
            c0735d.f10793w = bundle;
            if (emptySet != null) {
                c0735d.f10792v = (Scope[]) emptySet.toArray(new Scope[0]);
            }
            d3.c[] cVarArr2 = AbstractC0733b.f10758u;
            c0735d.f10795y = cVarArr2;
            c0735d.f10796z = cVarArr2;
            try {
                synchronized (abstractC0733b.f10763g) {
                    try {
                        g3.j jVar = abstractC0733b.f10764h;
                        if (jVar != null) {
                            jVar.y(new g3.p(abstractC0733b, abstractC0733b.f10775t.get()), c0735d);
                        } else {
                            Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            } catch (DeadObjectException e3) {
                Log.w("GmsClient", "IGmsServiceBroker.getService failed", e3);
                int i9 = abstractC0733b.f10775t.get();
                g3.o oVar = abstractC0733b.f10762e;
                oVar.sendMessage(oVar.obtainMessage(6, i9, 3));
                return;
            } catch (RemoteException e7) {
                e = e7;
                Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
                int i10 = abstractC0733b.f10775t.get();
                g3.r rVar = new g3.r(abstractC0733b, 8, null, null);
                g3.o oVar2 = abstractC0733b.f10762e;
                oVar2.sendMessage(oVar2.obtainMessage(1, i10, -1, rVar));
                return;
            } catch (SecurityException e8) {
                throw e8;
            } catch (RuntimeException e9) {
                e = e9;
                Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
                int i102 = abstractC0733b.f10775t.get();
                g3.r rVar2 = new g3.r(abstractC0733b, 8, null, null);
                g3.o oVar22 = abstractC0733b.f10762e;
                oVar22.sendMessage(oVar22.obtainMessage(1, i102, -1, rVar2));
                return;
            }
        }
        X0 x02 = ((AbstractC0733b) this.f4918q).f10770o;
        if (x02 != null) {
            x02.a(bVar);
        }
    }

    public void C(int i7) {
        C0321y c0321y = (C0321y) this.f4918q;
        View t5 = c0321y.t(i7 - c0321y.f6707u);
        if ((c0321y.f6712z & 3) == 1) {
            c0321y.I0(c0321y.f6711y, c0321y.f15478a.n(t5), t5);
        } else {
            c0321y.D0(t5, c0321y.f6711y);
        }
    }

    @Override // k.InterfaceC0899l0
    public void a(j.j jVar, j.k kVar) {
        j.f fVar = (j.f) this.f4918q;
        j.e eVar = null;
        fVar.f11437w.removeCallbacksAndMessages(null);
        ArrayList arrayList = fVar.f11439y;
        int size = arrayList.size();
        int i7 = 0;
        while (true) {
            if (i7 < size) {
                if (jVar == ((j.e) arrayList.get(i7)).f11414b) {
                    break;
                }
                i7++;
            } else {
                i7 = -1;
                break;
            }
        }
        if (i7 == -1) {
            return;
        }
        int i8 = i7 + 1;
        if (i8 < arrayList.size()) {
            eVar = (j.e) arrayList.get(i8);
        }
        fVar.f11437w.postAtTime(new j.d(this, eVar, kVar, jVar, 0), jVar, SystemClock.uptimeMillis() + 200);
    }

    @Override // j.o
    public void b(j.j jVar, boolean z7) {
        if (jVar instanceof j.t) {
            ((j.t) jVar).f11511v.j().c(false);
        }
        j.o oVar = ((C0890h) this.f4918q).f12022u;
        if (oVar != null) {
            oVar.b(jVar, z7);
        }
    }

    @Override // j.o
    public boolean c(j.j jVar) {
        C0890h c0890h = (C0890h) this.f4918q;
        if (jVar == c0890h.f12020s) {
            return false;
        }
        ((j.t) jVar).f11512w.getClass();
        c0890h.getClass();
        j.o oVar = c0890h.f12022u;
        if (oVar == null) {
            return false;
        }
        return oVar.c(jVar);
    }

    @Override // b5.o
    public V5.a d() {
        Bundle bundle = (Bundle) this.f4918q;
        if (bundle.containsKey("firebase_sessions_sessions_restart_timeout")) {
            return new V5.a(android.support.v4.media.session.b.C0(bundle.getInt("firebase_sessions_sessions_restart_timeout"), V5.c.SECONDS));
        }
        return null;
    }

    @Override // j.h
    public void e(j.j jVar) {
        j.h hVar = ((ActionMenuView) this.f4918q).f5462K;
        if (hVar != null) {
            hVar.e(jVar);
        }
    }

    @Override // b5.o
    public Object f(D5.d dVar) {
        return C1530l.f16479a;
    }

    @Override // k.InterfaceC0899l0
    public void g(j.j jVar, MenuItem menuItem) {
        ((j.f) this.f4918q).f11437w.removeCallbacksAndMessages(jVar);
    }

    @Override // b5.o
    public Boolean i() {
        Bundle bundle = (Bundle) this.f4918q;
        if (bundle.containsKey("firebase_sessions_enabled")) {
            return Boolean.valueOf(bundle.getBoolean("firebase_sessions_enabled"));
        }
        return null;
    }

    @Override // b5.o
    public Double j() {
        Bundle bundle = (Bundle) this.f4918q;
        if (bundle.containsKey("firebase_sessions_sampling_rate")) {
            return Double.valueOf(bundle.getDouble("firebase_sessions_sampling_rate"));
        }
        return null;
    }

    @Override // androidx.leanback.widget.InterfaceC0296i
    public View k(View view, int i7) {
        int i8;
        V0 v02 = (V0) this.f4918q;
        View view2 = (View) v02.f11961b;
        if (view != view2 && i7 == 33) {
            return view2;
        }
        Field field = O.f1447a;
        if (view.getLayoutDirection() == 1) {
            i8 = 17;
        } else {
            i8 = 66;
        }
        if (((View) v02.f11961b).hasFocus()) {
            if (i7 == 130 || i7 == i8) {
                return (ViewGroup) v02.f11960a;
            }
            return null;
        }
        return null;
    }

    @Override // a3.q
    public void l(U u7) {
        u7.i(((WindowManager) this.f4918q).getDefaultDisplay());
    }

    @Override // j.h
    public boolean m(MenuItem menuItem) {
        InterfaceC0896k interfaceC0896k = ((ActionMenuView) this.f4918q).f5467P;
        if (interfaceC0896k != null) {
            Iterator it = ((CopyOnWriteArrayList) ((L0) interfaceC0896k).f11911q.W.f1018s).iterator();
            while (it.hasNext()) {
                if (((H) it.next()).f5895a.p()) {
                    return true;
                }
            }
        }
        return false;
    }

    public void n(int i7, boolean z7) {
        I.h hVar = (I.h) this.f4918q;
        if (z7) {
            hVar.b(i7);
        } else {
            hVar.getClass();
        }
    }

    public void o(Object obj, int i7, int i8, int i9, int i10) {
        int i11;
        int i12;
        C0318v c0318v;
        int i13;
        View view = (View) obj;
        C0321y c0321y = (C0321y) this.f4918q;
        if (i10 == Integer.MIN_VALUE || i10 == Integer.MAX_VALUE) {
            if (!c0321y.W.f6643c) {
                i10 = ((R0) c0321y.f6693Y.f423t).f6474j;
            } else {
                R0 r02 = (R0) c0321y.f6693Y.f423t;
                i10 = r02.f6473i - r02.f6475k;
            }
        }
        if (!c0321y.W.f6643c) {
            i12 = i8 + i10;
            i11 = i10;
        } else {
            i11 = i10 - i8;
            i12 = i10;
        }
        int f12 = (c0321y.f1(i9) + ((R0) c0321y.f6693Y.f424u).f6474j) - c0321y.f6680K;
        O2.e eVar = c0321y.f6698d0;
        if (((o.i) eVar.f2561c) != null) {
            SparseArray<Parcelable> sparseArray = (SparseArray) ((o.i) eVar.f2561c).n(Integer.toString(i7));
            if (sparseArray != null) {
                view.restoreHierarchyState(sparseArray);
            }
        }
        ((C0321y) this.f4918q).l1(view, i9, i11, i12, f12);
        if (!c0321y.f6706t.f15543g) {
            c0321y.G1();
        }
        if ((c0321y.f6712z & 3) != 1 && (c0318v = c0321y.f6676G) != null) {
            boolean z7 = c0318v.f6661s;
            C0321y c0321y2 = c0318v.f6663u;
            if (z7 && (i13 = c0318v.f6662t) != 0) {
                c0318v.f6662t = c0321y2.r1(i13, true);
            }
            int i14 = c0318v.f6662t;
            if (i14 == 0 || ((i14 > 0 && c0321y2.j1()) || (c0318v.f6662t < 0 && c0321y2.i1()))) {
                c0318v.f15445a = c0321y2.f6674D;
                c0318v.j();
            }
        }
        if (c0321y.f6673C != null) {
            c0321y.f6703q.M(view);
            Q q5 = c0321y.f6673C;
            AbstractC0292g abstractC0292g = c0321y.f6703q;
            G g7 = (G) q5;
            if (i7 == 0) {
                g7.f6181q.r0();
            } else {
                g7.getClass();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x00f2, code lost:
        if (r0.f6676G == null) goto L71;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int q(int r9, boolean r10, java.lang.Object[] r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Z5.n.q(int, boolean, java.lang.Object[], boolean):int");
    }

    public int r() {
        C0321y c0321y = (C0321y) this.f4918q;
        return c0321y.f6706t.b() + c0321y.f6707u;
    }

    public int s(int i7) {
        C0321y c0321y = (C0321y) this.f4918q;
        View t5 = c0321y.t(i7 - c0321y.f6707u);
        if ((c0321y.f6712z & 262144) != 0) {
            return c0321y.f6705s.b(t5);
        }
        return c0321y.f6705s.e(t5);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    @Override // Z5.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object t(Z5.c r7, D5.d r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof Z5.a
            if (r0 == 0) goto L13
            r0 = r8
            Z5.a r0 = (Z5.a) r0
            int r1 = r0.f4881w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4881w = r1
            goto L18
        L13:
            Z5.a r0 = new Z5.a
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f4879u
            E5.a r1 = E5.a.f612q
            int r2 = r0.f4881w
            z5.l r3 = z5.C1530l.f16479a
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            a6.q r7 = r0.f4878t
            k3.AbstractC0958a.H(r8)     // Catch: java.lang.Throwable -> L2b
            goto L56
        L2b:
            r8 = move-exception
            goto L60
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            k3.AbstractC0958a.H(r8)
            a6.q r8 = new a6.q
            D5.i r2 = r0.f731r
            M5.g.c(r2)
            r8.<init>(r7, r2)
            r0.f4878t = r8     // Catch: java.lang.Throwable -> L5e
            r0.f4881w = r4     // Catch: java.lang.Throwable -> L5e
            java.lang.Object r7 = r6.f4918q     // Catch: java.lang.Throwable -> L5e
            L5.p r7 = (L5.p) r7     // Catch: java.lang.Throwable -> L5e
            java.lang.Object r7 = r7.j(r8, r0)     // Catch: java.lang.Throwable -> L5e
            if (r7 != r1) goto L51
            goto L52
        L51:
            r7 = r3
        L52:
            if (r7 != r1) goto L55
            return r1
        L55:
            r7 = r8
        L56:
            r7.r()
            return r3
        L5a:
            r5 = r8
            r8 = r7
            r7 = r5
            goto L60
        L5e:
            r7 = move-exception
            goto L5a
        L60:
            r7.r()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: Z5.n.t(Z5.c, D5.d):java.lang.Object");
    }

    public int u(int i7) {
        C0321y c0321y = (C0321y) this.f4918q;
        View t5 = c0321y.t(i7 - c0321y.f6707u);
        Rect rect = C0321y.f6669h0;
        c0321y.C(t5, rect);
        if (c0321y.f6704r == 0) {
            return rect.width();
        }
        return rect.height();
    }

    public void v() {
        ((C0271z) this.f4918q).f6149u.T();
    }

    public void w(Exception exc) {
        AbstractC0156a.r("MediaCodecAudioRenderer", "Audio sink error", exc);
        y yVar = ((g2.N) this.f4918q).f10593W0;
        Handler handler = yVar.f5135b;
        if (handler != null) {
            handler.post(new RunnableC0725p(yVar, exc, 1));
        }
    }

    public void x() {
        C0983g c0983g = ((C0980d) ((J3.m) this.f4918q).f).f12283k;
        if (c0983g != null && c0983g.f12269q.f11019b.f10148b > 1) {
            C0658c c0658c = c0983g.f12294t;
            View m7 = c0983g.m(c0658c.f10168b, c0983g.f12293s, true);
            if (m7 != null) {
                int d = h5.d.d(m7);
                C0979c c0979c = c0983g.f12296v;
                c0979c.f12274a.f12278e.j(d, 0);
                c0979c.a(m7);
            }
            if (c0983g.f12297w.i()) {
                c0983g.f15445a = c0658c.f10168b;
                c0983g.j();
            }
        }
    }

    public void y(View view) {
        k0 g7;
        C0980d c0980d = (C0980d) ((J3.m) this.f4918q).f;
        c0980d.getClass();
        C0983g c0983g = c0980d.f12283k;
        if (c0983g != null) {
            h5.d dVar = c0983g.f12269q;
            if (dVar.f11019b.f10148b <= 1) {
                O2.e eVar = c0983g.f12297w;
                if (eVar.h() && (g7 = dVar.g(view)) != null) {
                    int d = g7.d();
                    if (h5.d.q(view) && d != -1) {
                        int i7 = c0983g.f12294t.f10168b;
                        if (d != i7) {
                            h5.d dVar2 = (h5.d) eVar.f2561c;
                            if (!dVar2.f11023h) {
                                if (!dVar2.r()) {
                                    int i8 = eVar.f2560b;
                                    if ((i8 >= 0 || d >= i7) && (i8 <= 0 || d <= i7)) {
                                        return;
                                    }
                                } else {
                                    int i9 = eVar.f2560b;
                                    if ((i9 >= 0 || d <= i7) && (i9 <= 0 || d >= i7)) {
                                        return;
                                    }
                                }
                            }
                        }
                        if (eVar.f()) {
                            c0983g.f12296v.f12274a.f12278e.j(d, 0);
                        }
                    }
                }
            }
        }
    }

    public void z(View view) {
        J3.m mVar = (J3.m) this.f4918q;
        C0980d c0980d = (C0980d) mVar.f;
        c0980d.getClass();
        C0983g c0983g = c0980d.f12283k;
        if (c0983g != null) {
            h5.d dVar = c0983g.f12269q;
            if (dVar.f11019b.f10148b <= 1) {
                k0 g7 = dVar.g(view);
                C0658c c0658c = c0983g.f12294t;
                if (g7 != null && g7.d() == c0658c.f10168b) {
                    c0983g.f12296v.a(view);
                }
                if (c0983g.f12297w.i()) {
                    c0983g.f15445a = c0658c.f10168b;
                    c0983g.j();
                }
            }
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        M5.g.d(layoutParams, "null cannot be cast to non-null type com.rubensousa.dpadrecyclerview.layoutmanager.DpadLayoutParams");
        C0656a c0656a = (C0656a) layoutParams;
        C0980d c0980d2 = (C0980d) mVar.f;
        if (c0980d2.f12283k == null && !view.hasFocus() && c0656a.f15490a.d() == ((C0658c) mVar.f1397e).f10168b) {
            C0980d.e(c0980d2, ((C0657b) mVar.d).f10158o);
        }
    }

    public /* synthetic */ n(Object obj) {
        this.f4918q = obj;
    }

    @Override // a3.q
    public void h() {
    }
}
