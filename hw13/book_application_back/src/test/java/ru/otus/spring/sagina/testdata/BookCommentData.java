package ru.otus.spring.sagina.testdata;

import ru.otus.spring.sagina.entity.BookComment;

public class BookCommentData {
    public static final BookComment KARENINA_COMMENT_1 =
            new BookComment(1L, "очень хорошая книга стоит почитать", BookData.ANNA_KARENINA);
    public static final BookComment KARENINA_COMMENT_2 =
            new BookComment(2L, "this is my favorite russian book!", BookData.ANNA_KARENINA);
}
