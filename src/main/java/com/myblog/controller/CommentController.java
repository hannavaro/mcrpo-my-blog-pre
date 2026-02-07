import com.myblog.dto.CreateCommentRequest;
import com.myblog.dto.UpdateCommentRequest;
import com.myblog.model.Comment;
import com.myblog.model.Post;
import com.myblog.service.CommentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
            @PathVariable Long postId,
            @PathVariable Long commentId,
            @RequestBody UpdateCommentRequest request) {
        
        // TODO: Реализовать обновление комментария
        // 1. Вызвать commentService.updateComment(commentId, request)
        // 2. Обработать исключение IllegalArgumentException -> вернуть 404
        // 3. При успехе вернуть ResponseEntity.ok(updatedComment)
        // Подсказка: посмотрите на PostController.updatePost как пример
        throw new UnsupportedOperationException("TODO: Implement updateComment");

        log.debug("PUT /api/posts/{}/comments/{}", postId, commentId);
        //Вызов commentService.updateComment(commentId, request)
        try {
            Comment updatedComment = commentService.updateComment(commentId, request);
            return ResponseEntity.ok(updatedComment); //Возврат статус 200 OK при успехе
        } catch (IllegalArgumentException e) {
            return ResponseEntity.notFound().build();//404 Not Found, если коммент не найден
        }
    }

    @DeleteMapping("/{commentId}")
    public ResponseEntity<Void> deleteComment(
            @PathVariable Long postId,
            @PathVariable Long commentId) {
        
        // TODO: Реализовать удаление комментария
        // 1. Вызвать commentService.deleteComment(commentId)
        // 2. Вернуть ResponseEntity.ok().build()
        throw new UnsupportedOperationException("TODO: Implement deleteComment");

        log.debug("DELETE /api/posts/{}/comments/{}", postId, commentId);
        //Вызов commentService.deleteComment(commentId)
        commentService.deleteComment(commentId);
        //Возврат статус 200 OK
        return ResponseEntity.ok().build();
    }
}
