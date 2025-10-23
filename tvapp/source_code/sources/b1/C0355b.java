package b1;

import com.boxhdo.android.data.local.AppDatabase;
/* renamed from: b1.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0355b extends Z3.e {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0355b(AppDatabase appDatabase, int i7) {
        super(appDatabase);
        this.d = i7;
    }

    @Override // Z3.e
    public final String c() {
        switch (this.d) {
            case 0:
                return "DELETE FROM `tbl_continue_watch` WHERE `movie_id` = ? AND `episode_id` = ?";
            case 1:
                return "UPDATE tbl_continue_watch SET percent = ?, time = ? WHERE movie_id = ? AND episode_id = ? AND percent < ?";
            case 2:
                return "DELETE FROM tbl_continue_watch WHERE movie_id = ?";
            case 3:
                return "DELETE FROM tbl_history";
            default:
                return "DELETE FROM tbl_watch_list WHERE tmdb_id = ?";
        }
    }
}
